// 코드 54-4 길이가 0일 수도 있는 배열을 반환하는 올바른 방법

public Cheese[] getCheeses() {
    return cheesesInStock.toArray(new Cheese[0]);
}
