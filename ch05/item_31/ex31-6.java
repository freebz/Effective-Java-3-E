public static <E extends Comparable<E>> E max(List<E> list)


public static <E extends Comparable<? super E>> E max(
    List<? extends E> list)


List<ScheduledFuture<?>> scheduledFutures = ...;


public interface Comparable<E>
public interface Delayed extends Comparable<Delayed>
public interface ScheduledFuture<V> extends Delayed, Future<V>
