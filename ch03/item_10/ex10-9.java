// 명시적 null 검사 - 필요 없다!
@Override public boolean equals(Object o) {
    if (o == null)
	return false;
    ...
}


// 묵시적 null 검사 - 이쪽이 낫다.
@Override public boolean equals(Object o) {
    if (!(o instanceof MyType))
	return false;
    MyType mt = (MyType) o;
    ...
}
