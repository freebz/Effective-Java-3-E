// 코드 78-3 volatile 필드를 사용해 스레드가 정상 종료한다.

public class StopThread {
    private static volatile boolean stopRequested;

    public static void main(String[] args)
	    throws InterruptedException {
	Thread backgroundThread = new Thread(() -> {
	    int i = 0;
	    while (!stopRequested)
		i++;
	});
	backgroundThread.start();

	TimeUnit.SECONDS.sleep(1);
	stopRequested = true;
    }
}
