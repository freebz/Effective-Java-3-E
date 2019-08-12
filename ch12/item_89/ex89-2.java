// 인스턴스 통제를 위한 readResolve - 개선의 여지가 있다!
private Object readResolve() {
    // 진짜 Elvis를 반환하고, 가짜 Elvis는 가비지 컬렉터에 맡긴다.
    return INSTANCE;
}
