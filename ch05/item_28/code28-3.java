// 코드 28-3 제네릭 배열 생성을 허용하지 않는 이유 - 컴파일되지 않는다.

List<String>[] stringLists = new List<String>[1];  // (1)
List<Integer> intList = List.of(42);		   // (2)
Object[] objects = stringLists;			   // (3)
objects[0] = intList;				   // (4)
String s = stringLists[0].get(0);		   // (5)
