// 코드 45-3 스트림을 적절히 활용하면 깔끔하고 명료해진다.

public class Anagrams {
    public static void main(String[] args) throws IOException {
	Path dictionary = Path.get(args[0]);
	int minGroupSize = Integer.parseInt(args[1]);

	try (Stream<String> words = Files.lines(dictionary)) {
	    words.collect(groupingBy(word -> alphabetize(word)))
		.values().stream()
		.filter(group -> group.size() >= minGroupSize)
		.forEach(g -> System.out.println(g.size() + ": " + g));
	}
    }

    // alphabetize 메서드는 코드 45-1과 같다.
}
