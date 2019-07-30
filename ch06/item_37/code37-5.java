// 코드 37-5 배열들의 배열의 인덱스에 ordinal()을 사용 - 따라 하지 말 것!

public enum Phase {
    SOLID, LIQUID, GAS;

    public enum Transition {
	MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

	// 행은 from의 ordinal을, 열은 to의 ordinal을 인덱스로 쓴다.
	private static final Transition[][] TRANSITIONS = {
	    { null, MELT, SUBLIME },
	    { FREEZE, null, BOIL },
	    { DEPOSIT, CONDENSE, null }
	};

	// 한 상태에서 다른 상태로의 전이를 반환한다.
	public static Transition from(Phase from, Phase to) {
	    return TRANSITIONS[from.ordinal()][to.ordinal()];
	}
    }
}
