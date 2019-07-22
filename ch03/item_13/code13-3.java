// 코드 13-3 잘못된 clone 메서드 - 가변 상태를 공유한다!

@Override public HashTable clone() {
    try {
	HashTable result = (HashTable) super.clone();
	result.buckets = buckets.clone();
	return result;
    } catch (CloneNotSupportedException e) {
	throw new AssertionError();
    }
}
