// 코드 81-1 ConcurrentMap으로 구현한 동시성 정규화 맵 - 최적은 아니다.

private static final ConcurrentMap<String, String> map =
        new ConcurrentHashMap<>();

public static String intern(String s) {
    String previousValue = map.putIfAbsent(s, s);
    return previousValue == null ? s : previousValue;
}
