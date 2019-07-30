// 코드 42-2 람다식을 함수 객체로 사용 - 익명 클래스 대체

Collections.sort(words,
	(s1, s2) -> Integer.compare(s1.length(), s2.length()));
