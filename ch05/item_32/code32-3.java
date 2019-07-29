// 코드 32-3 제네릭 varargs 매개변수를 안전하게 사용하는 메서드

@SafeVarargs
static <T> List<T> flatten(List<? extends T>... lists) {
    List<T> result = new ArrayList<>();
    for (List<? extends T> list : lists)
	result.addAll(list);
    return result;
}
