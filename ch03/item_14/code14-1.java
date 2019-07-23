// 코드 14-1 객체 참조 필드가 하나뿐인 비교자

public final class CaseInsensitiveString
        implements Comparable<CaseInsensitiveString> {
    public int compareTo(CaseInsensitiveString cis) {
	return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }
    ... // 나머지 코드 생략
}
