// 코드 45-4 데카르트 곱 계산을 반복 방식으로 구현

private static List<Card> newDeck() {
    List<Card> result = new ArrayList<>();
    for (Suit suit : Suit.values())
	for (Rank rank : Rank.values())
	    result.add(new Card(suit, rand));
    return result;
}
