// 코드 82-1 비공개 락 객체 관용구 - 서비스 거부 공격을 막아준다.

private final Object lock = new Object();

public void foo() {
    synchronized(lock) {
	...
    }
}
