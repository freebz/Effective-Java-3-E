// 코드 79-3 외계인 메서드를 동기화 블록 바깥으로 옮겼다.

private void notifyElementAdded(E element) {
    List<SetObserver<E>> snapshot = null;
    synchronized(observers) {
	snapshot = new ArryaList<>(observers);
    }
    for (SetObserver<E> observer : snapshot)
	observer.added(this, element);
}
