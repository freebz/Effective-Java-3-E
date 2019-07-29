// 코드 31-4 E 소비자(consumer) 매개변수에 와일드카드 타입 적용

public void popAll(Collection<? super E> dst) {
    while (!isEmpty())
	dst.add(pop());
}
