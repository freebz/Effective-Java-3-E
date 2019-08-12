// Period.SerializationProxy용 readResolve 메서드
private Object readResolve() {
    return new Period(start, end); // public 생성자를 사용한다.
}
