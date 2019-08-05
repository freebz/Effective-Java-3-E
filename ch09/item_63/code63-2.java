// 코드 63-2 StringBuilder를 사용하면 문자열 연결 성능이 크게 개선된다.

public String statement2() {
    StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);
    for (int i = 0; i < numItems(); i++)
	b.append(lineForItem(i));
    return b.toString();
}
