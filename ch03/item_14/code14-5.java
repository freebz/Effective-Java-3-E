// 코드 14-5 정적 compare 메서드를 활용한 비교자

static Comparator<Object> hashCodeOrder = new Comparator<>() {
    public int compare(Object o1, Object o2) {
	return Integer.compare(o1.hashCode(), o2.hashCode());
    }
};
