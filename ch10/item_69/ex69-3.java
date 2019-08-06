// 컬렉션을 이런 식으로 순회하지 말 것!
try {
    Iterator<Foo> i = collection.iterator();
    while(true) {
	Foo foo = i.next();
	...
    }
} catch (NoSuchElementException e) {
}
