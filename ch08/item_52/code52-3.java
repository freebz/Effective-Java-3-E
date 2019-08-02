// 코드 52-3 인수를 포워드하여 두 메서드가 동일한 일을 하도록 보장한다.

public boolean contentEquals(StringBuffer sb) {
    return contentEquals((charSequence) sb);
}
