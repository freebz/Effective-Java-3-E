// 코드 83-2 인스턴스 필드의 지연 초기화 - synchronized 접근자 방식

private FieldType field;

private synchronized FieldType getField() {
    if (field == null)
	field = computeFieldValue();
    return field;
}
