// 직렬화 프록시 패턴용 readObject 메서드
private void readObject(ObjectInputStream stream)
        throws InvalidObjectException {
    throw new InvalidObjectException("프록시가 필요합니다.");
}
