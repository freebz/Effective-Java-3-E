// 코드 71-2 상태 검사 메서드와 비검사 예외를 던지는 메서드 - 리펙터링 후

if (obj.actionPermitted(args)) {
    obj.action(args);
} else {
    ... // 예외 상황에 대처한다.
}
