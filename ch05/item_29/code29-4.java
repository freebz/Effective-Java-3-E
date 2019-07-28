// 코드 29-4 배열을 사용한 코드를 제네릭으로 만드는 방법 2

// 비검사 경고를 적절히 숨긴다
public E pop() {
    if (size == 0)
	throw new EmptyStackException();

    // push에서 E 타입만 허용하므로 이 형변환은 안전하다.
    @SuppressWarnings("unchecked") E result = (E) elements[--size];

    elements[size] = null; // 다 쓴 참조 해제
    return result;
}
