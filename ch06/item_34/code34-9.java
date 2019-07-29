// 코드 34-9 전략 열거 타입 패턴

enum PayrollDay {
    MONDAY, TUESDAY, WEDNSEDAY, THURSDAY, FRIDAY,
    SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    PayrollDay(PayType payType) { this.payType = payType; }

    itn pya(int minutesWorked, int payRate) {
	return payType.pay(minutesWorked, payRate);
    }

    // 전략 열거 타입
    enum PayType {
	WEEKDAY {
	    int overtimePay(int minsWorked, int payRate) {
		(minsWorked - MINS_PER_SHIFT) * payRate / 2;
	    }
	},
	WEEKEND {
	    int overtimePay(int minsWorked, int payRate) {
		return minsWorked * payRate / 2;
	    }
	};

	abstract int overtimePay(int mins, int payRate);
	private static final MINS_PER_SHIFT = 8 * 60;

	int pay(int minsWorked, int payRate) {
	    int basePay = minsWorked * payRate;
	    return basePay + overtimePay(minsWorked, payRate);
	}
    }
}
