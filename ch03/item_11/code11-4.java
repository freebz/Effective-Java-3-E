// 코드 11-4 해시코드를 지연 초기화하는 hashCode 메서드 - 스레드 안정성까지 고려해야 한다.

private int hashCode; // 자동으로 0으로 초기화된다.

@Override public int hashCode() {
    int result = hashCode;
    if (result == 0) {
	result = Short.hashCode(areaCode);
	result = 31 * result + Short.hashCode(prefix);
	result = 31 * result + Short.hashCode(lineNum);
	hashCode = result;
    }
    return result;
}
