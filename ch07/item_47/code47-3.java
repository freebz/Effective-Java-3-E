// 코드 47-3 Stream<E>를 Iterable<E>로 중개해주는 어댑터

public static <E> Iterable<E> iterableOf(Stream<E> stream) {
    return stream::iterator;
}
