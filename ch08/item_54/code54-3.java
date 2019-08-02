// 코드 54-3 최적화 - 빈 컬렉션을 매번 새로 할당하지 않도록 했다.

public List<Cheese> getCheeses() {
    return cheesesInStock.isEmpty() ? Collections.emptyList()
	: new ArrayList<>(cheesesInStock);
}
