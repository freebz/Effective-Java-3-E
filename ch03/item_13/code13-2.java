// 코드 13-2 가변 상태를 참조하는 클래스용 clone 메서드

@Override public Stack clone() {
    try {
	Stack result = (Stack) super.clone();
	result.elements = elements.clone();
	return result;
    } catch (ClonedNotSupportedException e) {
	throw new AssertionError();
    }
}
