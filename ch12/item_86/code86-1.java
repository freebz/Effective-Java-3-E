// 코드 86-1 상태가 있고, 확장 가능하고, 직렬화 가능한 클래스용 readObjectNoData 메서드

private void readObjectNoData() throws InvalidObjectException {
    throw new InvalidObjectException("스트림 데이터가 필요합니다");
}
