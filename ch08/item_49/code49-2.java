// 코드 49-2 재귀 정렬용 private 도우미 함수

private static void sort(long a[], int offset, int length) {
    assert a != null;
    assert offset >= 0 && offset <= a.length;
    assert length >= 0 && length <= a.length - offset;
    ... // 계산 수행
}
