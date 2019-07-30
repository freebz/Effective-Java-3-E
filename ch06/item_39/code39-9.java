// 코드 39-9 반복 가능 애너테이션을 두 번 단 코드

@ExceptionTest(IndexOutOfBoundsException.class)
@ExceptionTest(NullPointerException.class)
public static void doublyBad() { ... }
