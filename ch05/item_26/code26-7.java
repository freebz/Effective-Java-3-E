// 코드 26-7 로 타입을 써도 좋은 예 - instanceof 연산자

if (o instanceof Set) {		// 로 타입
    Set<?> s = (Set<?>) o;	// 와일드카드 타입
    ...
}
