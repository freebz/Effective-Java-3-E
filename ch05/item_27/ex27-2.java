public <T> T[] toArray(T[] a) {
    if (a.length < size)
	return (T[]) Arrays.copyOf(elements, size, a.getClass());
    System.arraycopy(elements, 0, a, 0, size);
    if (a.length > size)
	a[size] = null;
    return a;
}
