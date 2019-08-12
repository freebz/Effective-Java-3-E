// 코드 88-3 유효성 검사를 수행하는 readObject 메서드 - 아직 부족하다!

private void readObject(ObjectInputStream s)
        throws IOException, ClassNotFoundException {
    s.defaultReadObject();

    // 불변식을 만족하는지 검사한다.
    if (start.compareTo(end) > 0)
	throw new InvalidObjectException(start +" after "+ end);
}
