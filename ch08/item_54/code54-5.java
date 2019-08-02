// 코드 54-5 최적화 - 빈 배열을 매번 새로 할당하지 않도록 했다.

private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

public Cheese[] getCheeses() {
    return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
}
