public static <E> Set<E> union(Set<E> s1, Set<E> s2)


public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2)



Set<Integer> integers = Set.of(1, 3, 5);
Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
Set<Number> numbers = union(integers, doubles);
