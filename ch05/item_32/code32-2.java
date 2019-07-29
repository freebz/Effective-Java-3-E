// 코드 32-2 자신의 제네릭 매개변수 배열의 참조를 노출한다. - 안전하지 않다!

static <T> T[] toArray(T... args) {
    return args;
}
