// 코드 50-3 수정한 생성자 - 매개변수의 방어적 복사본을 만든다.

public Period(Date start, Date end) {
    this.start = new Date(start.getTime());
    this.end = new Date(end.getTime());

    if (this.start.compareTo(this.end) > 0)
	throw new IllegalArgumentException(
	    this.start + " after " + this.end);
}
