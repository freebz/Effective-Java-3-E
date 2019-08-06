/**
 * 이 리스트 안의 지정한 위치의 원소를 반환한다.
 * @throws IndexOutOfBoundsException index가 범위 밖이라면,
 *         즉 ({@code < 0 || index >= size()})이면 발생한다.
 */
public E get(int index) {
    ListIterator<E> i = listIterator(index);
    try {
	return i.next();
    } catch (NoSuchElementException e) {
	throw new IndexOutOfBoundsException("인덱스: " + index);
    }
}
