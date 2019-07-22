// 잘못된 예 - 입력 타입은 반드시 Object여야 한다!
public boolean equals(MyClass o) {
    ...
}


// 여전히 잘못된 예 - 컴파일되지 않음
@Override public boolean equals(MyClass o) {
    ...
}
