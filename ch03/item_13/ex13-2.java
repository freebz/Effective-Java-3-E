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
    }
    ... // 나머지 코드는 생략
}
