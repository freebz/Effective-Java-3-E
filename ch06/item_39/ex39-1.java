if (m.isAnnotationPresent(ExceptionTest.class)) {
    tests++;
    try {
	m.invoke(null);
	System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
    } catch (InvocationTargetException wrappedEx) {
	Throwable exc = wrappedEx.getCause();
	Class<? extends Throwable> excType =
	    m.getAnnotation(ExceptionTest.class).value();
	if (excType.isInstance(exc)) {
	    passed++;
	} else {
	    System.out.printf(
		"테스트 %s 실패: 기대한 예외 %s, 발생한 예외 %s%n",
		m, excType.getName(), exc);
	}
    } catch (Exception exc) {
	System.out.println("잘못 사용한 @ExceptionTest: " + m);
    }
}
