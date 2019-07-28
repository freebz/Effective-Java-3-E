// 코드 30-6 재귀적 타입 한정을 이용해 상호 비교할 수 있음을 표현했다.

public static <E extends Comparable<E>> E max(Collection<E> c);
