// 코드 55-1 컬렉션에서 최대값을 구한다(컬렉션이 비었으면 예외를 던진다).

public static <E extends Comparable<E>> E max(Collection<E> c) {
    if (c.isEmpty())
	throw new IllegalArgumentException("빈 컬렉션");

    E result = null;
    for (E e : c)
	if (result == null || e.compareTo(result) > 0)
	    result = Objects.requireNonNull(e);

    return result;
}
