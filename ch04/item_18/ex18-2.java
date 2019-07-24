Set<Instant> times = new InstrumentedHashSet(new TreeSet<>(cmp));
Set<E> s = new InstrumentedHashSet<>(new HashSet<>(INIT_CAPACITY));



static void walk(Set<Dog> dogs) {
    InstrumentedSet<Dog> iDogs = new InstrumentedSet<>(dogs);
    ... // 이 메서드에서는 dogs 대신 iDogs를 사용한다.
}
