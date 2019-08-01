// 코드 46-2 스트림을 제대로 활용해 빈도표를 초기화한다.

Map<String, Long> freq;
try (Stream<String> words = new Scanner(file).tokens()) {
    freq = words
	.collect(groupingBy(String::toLowerCase, counting()));
}
