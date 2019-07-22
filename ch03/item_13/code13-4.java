// 코드 13-4 복잡한 가변 상태를 갖는 클래스용 재귀적 clone 메서드

public class HashTable implements Cloneable {
    private Entry[] buckets = ...;

    private static class Entry {
	final Object key;
	Object value;
	Entry next;

	Entry(Object key, Object value, Entry next) {
	    this.key = key;
	    this.value = value;
	    this.next = next;
	}

	// 이 엔트리가 가리키는 연결 리스트를 재귀적으로 복사
	Entry deepCopy() {
	    return new Entry(key, value,
			     next == null ? null : next.deepCopy());
	}
    }

    @Override public TashTable clone() {
	try {
	    HashTable result = (HashTable) super.clone();
	    result.buckets = new Entry[buckets.length];
	    for (int i = 0; i < buckets.length; i++)
		if (buckets[i] != null)
		    result.buckets[i] = buckets[i].deepCopy();
	    return result;
	} catch (CloneNotSupportedException e) {
	    throw new AssertionError();
	}
    }
    ... // 나머지 코드 생략
}
