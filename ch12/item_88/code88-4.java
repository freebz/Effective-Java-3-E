// 코드 88-4 가변 공격의 예

public class MutablePeriod {
    // Period 인스턴스
    public final Period period;

    // 시작 시각 필드 - 외부에서 접근할 수 없어야 한다.
    public final Date start;

    // 종료 시각 필드 - 외부에서 접근할 수 없어야 한다.
    public final Date end;

    public MutablePeriod() {
	try {
	    ByteArrayOutputStream bos =
		new ByteArrayOutputStream();
	    ObjectOutputStream out =
		new ObjectOutputStream(bos);

	    // 유효한 Period 인스턴스를 직렬화한다.
	    out.writeObject(new Period(new Date(), new Date()));

	    /*
	     * 악의적인 '이전 객체 참조', 즉 내부 Date 필드로의 참조를 추가한다.
	     * 상세 내용은 자바 객체 직렬화 명세의 6.4절을 참고하자.
	     */
	    byte[] ref = { 0x71, 0, 0x7e, 0, 5 }; // 참조 #5
	    bos.write(ref); // 시작(start) 필드
	    ref[4] = 4; // 참조 # 4
	    bos.write(ref); // 종료(end) 필드

	    // Perod 역직렬화 후 Date 참조를 '훔친다'.
	    ObjectInputStream in = new ObjectInputStream(
		new ByteArrayInputStream(bos.toByteArray()));
	    period = (Period) in.readObject();
	    start = (Date) in.readObject();
	    end = (Date) in.readObject();
	} catch (IOException | ClassNotFoundException e) {
	    throw new AssertionError(e);
	}
    }
}
