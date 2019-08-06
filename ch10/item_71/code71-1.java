// 코드 71-1 검사 예외를 던지는 메서드 - 리펙터링 전

try {
    obj.action(args);
} catch (TheCheckedException e) {
    ... // 예외 상황에 대처한다.
}
