// 코드 83-3 정적 필드용 지연 초기화 홀더 클래스 관용구

private static class FieldHolder {
    static final FieldType field = computeFieldValue();
}

private static FieldType getField() { return FieldHolder.field; }
