// 코드 61-2 문제를 수정한 비교자

Comparator<Integer> naturalOrder = (iBoxed, jBoxed) -> {
    int i = iBoxed, j = jBoxed; // 오토박싱
    return i < j ? -1 : (i == j ? 0 : 1);
};
