// 코드 52-2 재정의된 메서드 호출 메커니즘 - 이 프로그램은 무엇을 출력할까?

class Wine {
    String name() { return "포도주"; }
}

class SparklingWine extends Wine {
    @Override String name() { return "발포성 포도주"; }
}

class Champagne extends SparklingWine {
    @Override String name() { return "샴페인"; }
}

public class Overriding {
    public static void main(String[] args) {
	List<Wine> wineList = List.of(
	    new Wine(), new SparklingWine(), new Champagne());

	for (Wine wine : wineList)
	    System.out.println(wine.name());
    }
}
