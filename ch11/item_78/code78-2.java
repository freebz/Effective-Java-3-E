// 코드 78-2 적절히 동기화해 스레드가 정상 종료한다.

public class StopThread {
    private static boolean stopRequested;

    private static sychronized void requestStop() {
	stopRequested = true;
    }

    private static sychronized boolean stopRequested() {
	return stopRequested;
    }

    public static void main(String[] args)
	    throws InterruptedException {
	Thread backgroundThread = new Thread(() -> {
	    int i = 0;
	    while (!stopRequested())
		i++;
	});
	backgroundThread.start();

	TimeUnit.SECONDS.sleep(1);
	requestStop();
    }
}
