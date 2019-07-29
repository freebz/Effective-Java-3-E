// 코드 33-5 asSubclass를 사용해 한정적 타입 토큰을 안전하게 형변환한다.

static Annotation getAnnotation(AnnotatedElement element,
				String annotationTypeName) {
    Class<?> annotationType = null; // 비한정적 타입 토큰
    try {
	annotationType = Class.forName(annotationTypeName);
    } catch (Exception ex) {
	throw new IllegalArgumentException(ex);
    }
    return element.getAnnotation(
	annotationType.asSubclass(Annotation.class));
}
