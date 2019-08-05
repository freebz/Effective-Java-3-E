// 코드 62-5 매개변수화하여 타입안전성 확보

public final class ThreadLocal<T> {
    public ThreadLocal();
    public void set(T value);
    public T get();
}
