// 코드 46-1 스트림 패러다임ㅇ르 이해하지 못한 채 API만 사용했다 - 따라 하지 말 것!

Map<String, Long> freq = new HashMap<>();
try (Stream<String> words = new Scanner(file).tokens()) {
    words.forEach(word -> {
	freq.merge(word.toLowerCase(), 1L, Long::sum);
    });
}
