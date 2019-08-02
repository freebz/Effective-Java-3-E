// 코드 54-2 빈 컬렉션을 반환하는 올바른 예

public List<Cheese> getCheeses() {
    return new ArrayList<>(cheesesInStock);
}
