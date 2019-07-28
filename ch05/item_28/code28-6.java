// 코드 28-6 리스트 기반 Chooser - 타입 안전성 확보!

public class Chooser<T> {
    private final List<T> choiceList;

    public Chooser(Collection<T> choices) {
	choiceList = new ArrayList<>(choices);
    }

    public T choose() {
	Random rnd = ThreadLocalRandom.current();
	return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}
