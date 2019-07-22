// 코드 10-1 잘못된 코드 - 대칭성 위배!

public final class CaseInsensitiveString {
    private final String s;

    public CaseInsensitiveString(String s) {
	this.s = Objects.requireNonNull(s);
    }

    // 대칭성 위배!
    @Override public boolean equals(Object o) {
	if (o instanceof CaseInsensitiveString)
	    return s.equalsIgnoreCase(
		((CaseInsensitiveString) o).s);
	if (o instanceof String) // 한 방향으로만 작동한다!
	    return s.equalsIgnoreCase((String) o);
	return false;
    }
    ... // 나머지 코드는 생략
}
