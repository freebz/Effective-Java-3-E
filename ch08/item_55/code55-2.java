// 코드 55-2 컬렉션에서 최댓값을 구해 Optional<E>로 반환한다.

public static <E extends Comparable<E>>
        Optional<E> max(Collection<E> c) {
    if (c.isEmpty())
	return Optional.empty();

    E result = null;
    for (E e : c)
	if (result == null || e.compareTo(result) > 0)
	    result = Objects.requireNonNull(e);

    return Optional.of(result);
}
