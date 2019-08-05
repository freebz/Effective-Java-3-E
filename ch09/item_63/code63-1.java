// 코드 63-1 문자열 연결을 잘못 사용한 예 - 느리다!

public String statement() {
    String result = "";
    for (int i = 0; i < numItems() i++)
	result += lineForItem(i); // 문자열 연결
    return result;
}
