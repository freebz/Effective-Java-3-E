// 코드 34-7 열거 타입용 fromString 메서드 구현하기

private static final Map<String, Operation> stringToEnum =
    Stream.of(values()).collect(
	toMap(Object::toString, e -> e));

// 지정한 문자열에 해당하는 Operation을 (존재한다면) 반환한다.
public static Optional<Operation> fromString(String symbol) {
    return Optional.ofNullable(stringToEnum.get(symbol));
}
