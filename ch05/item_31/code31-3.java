// 코드 31-3 와일드카드 타입을 사용하지 않은 popAll 메서드 - 결함이 있다!

public void popAll(Collection<E> dst) {
    while (!isEmpty())
	dst.add(pop());
}
