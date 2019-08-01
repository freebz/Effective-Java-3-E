// 코드 46-3 빈도표에서 가장 흔한 단어 10개를 뽑아내는 파이프라인

List<String> topTen = freq.keySet().stream()
    .sorted(comparing(freq::get).reversed())
    .limit(10)
    .collect(toList9));
