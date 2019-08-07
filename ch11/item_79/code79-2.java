// 코드 79-2 쓸데없이 백그라운드 스레드를 사용하는 관찰자

set.addObserver(new SetObserver<>() {
    public void added(ObservableSet<Integer> s, Integer e) {
	System.out.println(e);
	if (e == 23) {
	    ExecutorService exec =
		Executors.newSingleThreadExecutor();
	    try {
		exec.submit(() -> s.removeObserver(this)).get();
	    } catch (ExecutionException | InterruptedException ex) {
		throw new AssertionError(ex);
	    } finally {
		exec.shutdown();
	    }
	}
    }
});
