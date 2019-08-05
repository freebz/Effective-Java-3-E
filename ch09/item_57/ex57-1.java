Iterator<Element> i = c.iterator();
while (i.hasNext()) {
    doSomething(i.hasNext());
}
...

Iterator<Element> i2 = c2.iterator();
while (i.hasNext()) {		// 버그!
    doSomething(i2.next());
}
