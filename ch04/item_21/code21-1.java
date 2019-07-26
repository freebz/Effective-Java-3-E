// 코드 21-1 자바 8의 Collection 인터페이스에 추가된 디폴트 메서드

default boolean removeIf(Predicate<? super E> filter) {
    Objects.requireNonNull(filter);
    boolean result = false;
    for (Iterator<E> it = iterator(); it.hasNext(); ) {
	if (filter.test(it.next())) {
	    it.remove();
	    result = true;
	}
    }
    return result;
}
