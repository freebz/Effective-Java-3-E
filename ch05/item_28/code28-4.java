// 코드 28-4 Chooser - 제네릭을 시급히 적용해야 한다!

public class Chooser {
    private final Object[] choiceArray;

    public Chooser(Collection choices) {
	choiceArray = choices.toArray();
    }

    public Object choose() {
	Random rnd = ThreadLocalRandom.current();
	return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
