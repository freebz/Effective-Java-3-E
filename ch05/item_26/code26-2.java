// 코드 26-2 반복자의 로 타입 - 따라 하지 말 것!

for (Iterator i = stamps.iterator(); i.hasNext(); ) {
    Stamp stamp = (Stamp) i.next(); // ClassCastException을 던진다.
    stamp.cancel();
}
