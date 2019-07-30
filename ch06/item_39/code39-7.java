// 코드 39-7 배열 매개변수를 받는 애너테이션을 사용하는 코드

@ExceptionTest({ IndexOutOfBoundsException.class,
	         NullPointerException.class })
public static void doublyBad() {
    List<String> list = new ArrayList<>();

    // 자바 API 명세에 따르면 다음 메서드는 IndexOutOfBoundsException이나
    // NullPointerException을 던질 수 있다.
    list.addAll(5, null);
}
