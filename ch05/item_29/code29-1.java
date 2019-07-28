// 코드 29-1 Object 기반 스택 - 제네릭이 절실한 강력 후보!

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
	elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
	ensureCapacity();
	elements[size++] = e;
    }

    public Object pop() {
	if (size == 0)
	    throw new EmptyStackException();
	Object result = elements[--size];
	elements[size] = null; // 다 쓴 참조 해제
	return result;
    }

    public boolean isEmpty() {
	return size == 0;
    }

    private void ensureCapacity() {
	if (elements.length == size)
	    elements = Arrays.copyOf(elements, 2 * size + 1);
    }
}
