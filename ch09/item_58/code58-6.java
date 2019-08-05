// 코드 58-6 문제는 고쳤지만 보기 좋진 않다. 더 나은 방법이 있다!

for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
    Suit suit = i.next();
    for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); )
	deck.add(new Card(suit, j.next()));
}
