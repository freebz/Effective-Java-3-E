// 코드 47-6 입력 리스트의 모든 부분리스트를 스트림으로 반환한다.

public class SubLists {
    public static <E> Stream<List<E>> of(List<E> list) {
	return Stream.concat(Stream.of(Collections.emptyList()),
	    prefixes(list).flatMap(SubLists::suffixes));
    }

    private static <E> Stream<List<E>> prefixes(List<E> list) {
	return InputStream.rangeClosed(1, list.size())
	    .mapToObj(end -> list.subList(0, end));
    }

    private static <E> Stream<List<E>> suffixes(List<E> list) {
	return IntStream.range(0, list.size())
	    .mapToObj(start -> list.subList(start, list.size()));
    }
}
