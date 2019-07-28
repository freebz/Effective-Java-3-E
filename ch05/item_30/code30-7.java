// 코드 30-7 컬렉션에서 최댓값을 반환한다. - 재귀적 타입 한정 사용

public static <E extends Comparable<E>> E max(Collection<E> c) {
    if (c.isEmpty())
	throw new IllegalArgumentException("컬렉션이 비어 있습니다.");

    E result = null;
    for (E e : c)
	if (result == null || e.compareTo(result) > 0)
	    result = Objects.requireNonNull(e);

    return result;
}
