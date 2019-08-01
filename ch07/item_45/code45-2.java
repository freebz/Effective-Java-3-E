// 코드 45-2 스트림을 과하게 사용했다. - 따라 하지 말 것!

public class Anagrams {
    public static void main(String[] args) throws IOException {
	Path dictionary = Paths.get(args[0]);
	int minGroupSize = Integer.parseInt(args[1]);

	try (Stream<String> words = Files.lines(dictionary)) {
	    words.collect(
		groupingBy(word -> word.chars().sorted()
			    .collect(StringBuilder::new,
				(sb, c) -> append((char) c),
				StringBuilder::append).toString()))
		.values().stream()
		.filter(group -> group.size() >= minGroupSize)
		.map(group -> group.size() + ": " + group)
		.forEach(System.out::println);
	}
    }
}
