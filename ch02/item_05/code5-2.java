// 코드 5-2 싱글턴을 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.

public class SpellChecker {
    private final Lexicon dictionary = ...;

    private SpellChecker(...) {}
    public static SpellChecker INSTANCE = new SpellChecker(...);

    public boolean isValid(String word) { ... }
    public List<String> suggestions(String typo) { ... }
}
