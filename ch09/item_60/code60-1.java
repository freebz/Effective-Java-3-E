// 코드 60-1 오류 발생! 금융 계산에 부동소수 타입을 사용했다.

public static void main(String[] args) {
    double funds = 1.00;
    int itemsBought = 0;
    for (double price = 0.10; funds >= price; price += 0.10) {
	funds -= price;
	itemsBought++;
    }
    System.out.println(itemBought + "개 구입");
    System.out.println("잔동(달러): " + funds);
}
