// 코드 83-4 인스턴스 필드 지연 초기화용 이중검사 관용구

private volatile FieldType field;

private FieldType getField() {
    FieldType result = field;
    if (result != null) { // 첫 번째 검사 (락 사용 안 함)
	return result;
    }    

    synchronized(this) {
	if (field == null) // 두 번째 검사 (락 사용)
	    field = computeFieldValue();
	return field;
    }
}
