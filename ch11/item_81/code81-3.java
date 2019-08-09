// 코드 81-3 동시 실행 시간을 재는 간단한 프레임워크

public static long time(Executor executor, int concurrency,
			Runnable action) throws InterruptedException {
    CountDownLatch ready = new CountDownLatch(concurrency);
    CountDownLatch start = new CountDownLatch(1);
    CountDownLatch done = new CountDownLatch(concurrency);

    for (int i = 0; i < concurrency; i++) {
	executor.execute(() -> {
	    // 타이머에게 준비를 마쳤음을 알린다.
	    ready.countDown();
	    try {
		// 모든 작업자 스레드가 준비될 때까지 기다린다.
		start.await();
		action.run();
	    } catch (InterruptedException e) {
		Thread.currentThread().interrupt();
	    } finally {
		// 타이머에게 작업을 마쳤음을 알린다.
		done.countDonw();
	    }
	});
    }

    ready.await(); // 모든 작업자가 준비될 때까지 기다린다.
    long startNanos = System.nanoTime();
    start.countDown(); // 작업자들을 깨운다.
    done.await(); // 모든 작업자가 일을 끝마치기를 기다린다.
    return System.nanoTime() - startNanos;
}
