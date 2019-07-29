// 코드 36-2 EnumSet - 비트 필드를 대체하는 현대적 기법

public class Text {
    public enum Style { BOLD, ITALIC, UNDERLINE, STRIKETHROUGH }

    // 어떤 Set을 넘겨도 되나, EnumSet이 가장 좋다.
    public void applyStyles(SetStyle> styles) { ... }
}
