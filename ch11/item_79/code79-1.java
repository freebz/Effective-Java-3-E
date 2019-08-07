// 코드 79-1 잘못된 코드. 동기화 블록 안에서 외계인 메서드를 호출한다.

public class ObservableSet<E> extends ForwardingSet<E> {
    public ObservableSet(Set<E> set) { super(set); }

    private final List<SetObserver<E>> observers
	    = new ArrayList<>();

    public void addObserver(SetObserver<E> observer) {
	synchronized(observers) {
	    observers.add(observer);
	}
    }

    public boolean removeObserver(SetObserver<E> observer) {
	synchronized(observers) {
	    return observers.remove(observer);
	}
    }

    private void notifyElementAdded(E element) {
	synchronized(observers) {
	    for (SetObserver<E> observer : observers)
		observer.added(this, element);
	}
    }

    @Override public boolean add(E element) {
	boolean added = super.add(element);
	if (added)
	    notifyElementAdded(element);
	return added;
    }

    @Override public boolean addAll(Collection<? extends E> c) {
	boolean result = false;
	for (E element : c)
	    result |= add(element); // notifyElementAdded를 호출한다.
	return result;
    }
}
