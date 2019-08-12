Map<K, V> m = Collections.synchronizedMap(new HashMap<K, V>());
Set<K> s = m.keySet(); // 동기화 블록 밖에 있어도 된다.
   ...
synchronized(m) { // s가 아닌 m을 사용해 동기화해야 한다!
    for ( K key : s)
	key.f();
}
