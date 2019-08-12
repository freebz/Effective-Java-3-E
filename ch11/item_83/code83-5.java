// 코드 83-5 단일검사 관용구 - 초기화가 중복해서 일어날 수 있다!

private volatile FieldType field;

private FieldType getField() {
    FieldType result = field;
    if (result == null)
	field = result = computeFieldValue();
    return result;
}
