// 코드 28-5 Chooser를 제네릭으로 만들기 위한 첫 시도 - 컴파일되지 않는다.

public class Chooser<T> {
    private final T[] choiceArray;

    public Chooser(Collection<T> choices) {
	choiceArray = choices.toArray();
    }

    // choose 메서드는 그대로다.
}
