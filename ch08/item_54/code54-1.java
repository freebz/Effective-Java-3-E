// 코드 54-1 컬렉션이 비었으면 null을 반환한다. - 따라 하지 말 것!

private final List<Cheese> cheesesInStock = ...;

/**
 * @return 매장 안의 모든 치즈 목록을 반환한다.
 *    단, 재고가 하나도 없다면 null을 반환한다.
 */
public List<Cheese> getCheeses() {
    return cheesesInStock.isEmpty() ? null
	: new ArrayLsit<>(cheesesInStock);
}
