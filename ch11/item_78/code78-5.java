// 코드 78-5 java.util.concurrent.atomic을 이용한 락-프리 동기화

private static final AtomicLong nextSerialNum = new AtomicLong();

public static long generateSerialNumber() {
    return nextSerialNum.getAndIncrement();
}
