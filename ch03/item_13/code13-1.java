// 코드 13-1 가변 상태를 참조하지 ㅇ낳는 클래스용 clone 메서드

@Override public PhoneNumber clone() {
    try {
	return (PhoneNumber) super.clone();
    } catch (CloneNotSupportedException e) {
	throw new AssertionError(); // 일어날 수 없는 일이다.
    }
}
