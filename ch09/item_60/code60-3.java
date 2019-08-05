// 코드 60-3 정수 타입을 사용한 해법

public static void main(String[] args) {
    int itemBought = 0;
    int funds = 100;
    for (int price = 10; funds >= price; price += 10) {
	funds -= price;
	itemBought++;
    }
    System.out.println(itemBought + "개 구입");
    System.out.println("잔돈(센트): " + funds);
}
