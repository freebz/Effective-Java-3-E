// 코드 18-2 래퍼 클래스 - 상속 대신 컴포지션을 사용했다.

public class InstrumentedHashSet<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedHashSet(Set<E> s) {
	super(s);
    }

    @Override public boolean add(E e) {
	addCount++;
	return super.add(e);
    }

    @Override public boolean addAll(Collection<? extends E> c) {
	addCount += c.size();
	return super.addAll(c);
    }

    public int getAddCount() {
	return addCount;
    }
}
