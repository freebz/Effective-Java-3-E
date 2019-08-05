// 코드 57-2 반복자가 필요할 때의 관용구

for (Iterator<Element> i = c.iterator(); i.hasNext(); ) {
    Element e = i.next();
    ... // e와 i로 무언가를 한다.
}
