// 코드 37-7 EnumMap 버전에 새로운 상태 추가하기

public enum Phase {
    SOLID, LIQUID, GAS, PLASMA;

    public enum Transition {
	MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID),
	BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID),
	SUBLIME(SOLID, GAS), DEPOSIT(GAS, SOLID),
	IONIZE(GAS, PLASMA), DEIONIZE(PLASMA, GAS);

	... // 나머지 코드는 그대로다.
    }
}
