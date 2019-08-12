// 코드 90-2 EnumSet의 직렬화 프록시

private static class SerializationProxy <E extends Enum<E>>
        implements Serializable {
    // 이 EnumSet의 원소 타입
    private final Class<E> elementType;

    // 이 EnumSet 안의 원소들
    private final Enum<?>[] elements;

    SerializationProxy(EnumSet<E> set) {
	elementType = set.elementType;
	elements = set.toArray(new Enum<?>[0]);
    }

    private Object readResolve() {
	EnumSet<E> result = EnumSet.noneOf(elementType);
	for (Enum<?> e : elements)
	    result.add((E)e);
	return result;
    }

    private static final long serialVersionUID =
	362491234563181265L;
}
