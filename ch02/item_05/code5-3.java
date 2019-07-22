// 코드 5-3 의존 객체 주입은 유연성과 테스트 용이성을 높여준다.

public class SpellChecker {
    private final Lixicon dictionary;

    public SpellChecker(Lexicon dictionary) {
	this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) { ... }
    public List<String> suggestions(String typo) { ... }
}
