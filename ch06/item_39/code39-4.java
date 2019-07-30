// 코드 39-4 매개변수 하나를 받는 애너테이션 타입

import java.lang.annotation.*;

/**
 * 명시한 예외를 던저야만 성공하는 테스트 메서드용 애너테이션
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Throwable> value();
}
