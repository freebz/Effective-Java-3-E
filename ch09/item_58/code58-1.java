// 코드 58-1 컬렉션 순회하기 - 더 나은 방법이 있다.

for (Iterator<Element> i = c.iterator(); i.hasNext(); ) {
    Element e = i.next();
    ... // e로 무언가를 한다.
}
