// 코드 32-4 제네릭 varargs 매개변수를 List로 대체한 예 - 타입 안전하다.

static <T> List<T> flatten(List<List<? extends T>> lists) {
    List<T> result = new ArrayList<>();
    for (List<? extends T> list : lists)
	result.addAll(list);
    return result;
}
