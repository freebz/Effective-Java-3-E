// 코드 34-8 값에 따라 분기하여 코드를 공유하는 열거 타입 - 좋은 방법인가?

enum PayrollDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
    SATURDAY, SUNDAY;

    private static final int MINS_PER_SHIFT = 8 * 60;

    int pay(int minutesWorked, int payRate) {
	int basePay = minutesWorked * payRate;

	int overtimePay;
	switdh(this) {
	case SATURDAY: case SUNDAY:  // 주말
	    overtimePay = basePay / 2;
	    break;
	default: // 주중
	    overtimePay = minutesWorked <= MINS_PER_SHIFT ?
		0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
	}

	return basePay + overtimePay;
    }
}
