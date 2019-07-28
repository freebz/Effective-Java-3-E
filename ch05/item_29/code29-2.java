// 코드 29-2 제네릭 스택으로 가는 첫 단계 - 컴파일되지 않는다.

public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
	elements = new E[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
	ensureCapacity();
	elements[size++] = e;
    }

    public E pop() {
	if (size == 0)
	    throw new EmptyStackException();
	E result = elements[--size];
	elements[size] = null; // 다 쓴 참조 해제
	return result;
    }
    ... // isEmpty와 ensureCapacity 메서드는 그대로다.
}
