// 코드 32-1 제네릭과 varargs를 혼용하면 타입 안전성이 깨진다!

static void dangerous(List<String>... stringLists) {
    List<Integer> intList = List.of(42);
    Object[] objects = stringLists;
    objects[0] = intList;	      // 힙 오염 발생
    String s = stringList[0].get(0);  // ClassCastException
}
