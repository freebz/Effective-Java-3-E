// 코드 81-2 ConcurrentMap으로 구현한 동시성 정규화 맵 - 더 빠르다!

public static String intern(String s) {
    String result = map.get(s);
    if (result == null) {
	result = map.putIfAbsent(s, s);
	if (result == null)
	    result = s;
    }
    return result;
}
