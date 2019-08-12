// 코드 90-1 Period 클래스용 직렬화 프록시

private static class SerializationProxy implements Serializable {
    private final Date start;
    private final Date end;

    SerializationProxy(Period p) {
	this.start = p.start;
	this.end = p.end;
    }

    private static final long serialVersionUID =
	234098243823485285L; // 아무 값이나 상관없다. (아이템 87)
}
