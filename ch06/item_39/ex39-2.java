if (m.isAnnotationPresent(ExceptionTest.class)) {
    tests++;
    try {
	m.invoke(null);
	System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
    } catch (InvocationTargetException wrappedExc) {
	Throwable exc = wrappedExc.getCause();
	int oldPassed = passed;
	Class<? extends Throwable>[] excTypes =
	    m.getAnnotation(ExceptionTest.class).value();
	for (Class<? extends Throwable> excType : excTypes) {
	    if (excType.isInstance(exc)) {
		passed++;
		break;
	    }
	}
	if (passed == oldPassed)
	    System.out.printf(
		"테스트 %s 실패: %s %n", m, exc);
    }
}
