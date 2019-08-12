// 코드 88-5 방어적 복사와 유효성 검사를 수행하는 readObject 메서드

private void readObject(ObjectInputStream s)
        throws IOException, ClassNotFoundException {
    s.defaultReadObject();

    // 가변 요소들은 방어적으로 복사한다.
    start = new Date(start.getTime());
    end = new Date(end.getTime());

    // 불변식을 만족하는지 검사한다.
    if (start.compareTo(end) > 0)
	throw new IvalidObjectException(start +" after "+ end);
}
