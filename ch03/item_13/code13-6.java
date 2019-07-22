// 코드 13-6 하위 클래스에서 Cloneable을 지원하지 못하게 하는 clone 메서드

@Override
protected final Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
}
