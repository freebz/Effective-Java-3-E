protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
    return size() > 100;
}
