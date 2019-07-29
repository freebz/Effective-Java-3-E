// 코드 31-2 E 생산자(producer) 매개변수에 와일드카드 타입 적용

public void pushAll(Iterable<? extends E> src) {
    for (E e : src)
	push(e);
}
