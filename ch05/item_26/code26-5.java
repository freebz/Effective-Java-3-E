// 코드 26-5 잘못된 예 - 모르는 타입의 원소도 받는 로 타입을 사용했다.

static int numElementsInCommon(Set s1, Set s2) {
    int result = 0;
    for (Object o1 : s1)
	if (s2.contains(o1))
	    result++;
    return result;
}
