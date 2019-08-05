// 코드 61-1 잘못 구현된 비교자 - 문제를 찾아보자!

Comparator<Integer> naturalOrder =
    (i, j) -> (i < j) ? -1 : (i == j ? 0 : 1);
