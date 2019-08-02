// 코드 55-3 컬렉션에서 최댓값을 구해 Optional<E>로 반환한다. - 스트림 버전

public static <E extends Comparable<E>>
        Optional<E> max(Collection<E> c) {
    return c.stream().max(Comparator.naturalOrder());
}
