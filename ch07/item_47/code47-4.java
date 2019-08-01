// 코드 47-4 Iterable<E>를 Stream<E?로 중개해주는 어댑터

public static <E> Stream<E> streamOf(Iterable<E> iterable) {
    return StreamSupport.stream(iterable.spliterator(), false);
}
