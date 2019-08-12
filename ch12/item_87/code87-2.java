// 코드 87-2 ㅣㄱ본 직렬화 형태에 적합하지 않은 클래스

public final class StringList implements Serializable {
    private int size =0;
    private Entry head = null;

    private static class Entry impelements Serializable {
	String data;
	Entry next;
	Entry previous;
    }

    ... // 나머지 코드 생략
}
