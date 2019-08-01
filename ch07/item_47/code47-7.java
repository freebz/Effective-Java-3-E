// 코드 47-7 입력 리스트의 모든 부분리스트를 스트림으로 반환한다.

public static <E> Stream<List<E>> of(List<E> list) {
    return IntStream.range(0, list.size())
	.mapToObj(start ->
	    IntStream.rangeClosed(start + 1, list.size())
		.mapToObj(end -> list.subList(start, end)))
	.flatMap(x -> x);
}
