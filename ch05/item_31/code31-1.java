// 코드 31-1 와일드카드 타입을 사용하지 않은 pushAll 메서드 - 결함이 있다!

public void pushAll(Iterable<E> src) {
    for (E e : src)
	push(e);
}
