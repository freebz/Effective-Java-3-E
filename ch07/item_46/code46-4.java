// 코드 46-4 toMap 수집기를 사용하여 문자열을 열거 타입 상수에 매핑한다.

private static final Map<String, Operation> stringToEnum =
    Stream.of(values()).collect(
	toMap(Object::toString, e -> e));
