set.addObserver(new SetObserver<>() {
    public void added(ObservableSet<Integer> s, Integer e) {
	System.out.println(e);
	if (e == 23)
	    s.removeObserver(this);
    }
});
