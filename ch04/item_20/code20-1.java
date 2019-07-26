// 코드 20-1 골격 구현을 사용해 완성한 구체 클래스

static List<Integer> intArrayAsList(int[] a) {
    Objects.requireNonNull(a);

    // 다이아몬드 연산자를 이렇게 사용하는 건 자바 9부터 가능하다.
    // 더 낮은 버전을 사용한다면 <Integer>로 수정하자.
    return new AbstractList<>() {
	@Override public Integer get(int i) {
	    return a[i];   // 오토박싱(아이템 6)
	}

	@Override public Integer set(int i, Integer val) {
	    int oldVal = a[i];
	    a[i] = val;    // 오토언박싱
	    return oldVal; // 오토박싱
	}

	@Override public int size() {
	    return a.length;
	}
    };
}
