// 코드 24-1 비정적 멤버 클래스의 흔한 쓰임 - 자신의 반복자 구현

public class MySet<E> extends AbstractSet<E> {
    ... // 생략

    @Override public Iterator<E> iterator() {
	return new MyIterator();
    }

    private class MyIterator implements Iterator<E> {
	...
    }
}
