// 코드 14-4 해시코드 값의 차를 기준으로 하는 비교자 - 추이성을 위배한다!

static Comparator<Object> hashCodeOrder = new Comparator<>() {
    public int compare(Object o1, Object o2) {
	return o1.hashCode() - o2.hashCode();
    }
};
