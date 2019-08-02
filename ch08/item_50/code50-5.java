// 코드 50-5 수정한 접근자 - 필드의 방어적 복사본을 반환한다.

public Date start() {
    return new Date(start.getTime());
}

public Date end() {
    return new Date(end.getTime());
}
