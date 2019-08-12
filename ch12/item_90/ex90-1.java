// 직렬화 프록시 패턴용 writeReplace 메서드
private Object writeReplace() {
    return new SerializationProxy(this);
}
