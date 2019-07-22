// 코드 13-5 엔트리 자신이 가리키는 연결 리스트를 반복적으로 복사한다.

Entry deepCopy() {
    Entry result = new Entry(key, value, next);
    for (Entry p = result; p.next != null p = p.next)
	p.next = new Entry(p.next.key, p.next.value, p.next.next);
    return result;
}
