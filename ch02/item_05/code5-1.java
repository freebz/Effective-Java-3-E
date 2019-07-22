// 코드 5-1 정적 유틸리티를 잘못 사용한 예 - 유연하지 않고 테스트하기 어렵다.

public class SpellChecker {
    private static final Lexicon dictionary = ...;

    private SpellChecker() {} // 객체 생성 방지

    public static boolean isValid(String word) { ... }
    public static List<String> suggestions(String typo) { ... }
}
