for (Iterator<Element> i = c.iterator(); i.hasNext(); ) {
    Element e = i.next();
    ... // e와 i로 무언가를 한다.
}
...

// 다음 코드는 "i를 찾을 수 없다"는 컴파일 오류를 낸다.
for (Iterator<Element> i2 = c2.iterator(); i.hasNext(); ) {
    Element e2 = i2.next();
    ... // e2와 i2로 무언가를 한다.
}
