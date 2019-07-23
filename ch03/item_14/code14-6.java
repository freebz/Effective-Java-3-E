// 코드 14-6 비교자 생성 메서드를 활요한 비교자

static Comparator<Object> hashCodeOrder =
    Comparator.comparingInt(o -> o.hashCode());
