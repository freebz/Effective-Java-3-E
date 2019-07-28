// 코드 30-1 로 타입 사용 - 수용 불가! (아이템 26)

public static Set union(Set s1, Set s2) {
    Set result = new HashSet(s1);
    result.addAll(s2);
    return result;
}
