// 코드 45-5 데카르트 곱 계산을 스트림 방식으로 구현

private static List<Card> newDeck() {
    return Stream.of(Suit.values())
	.flatMap(suit ->
	    Stream.of(Rank.values())
		.map(rank -> new Card(suit, rank)))
	.collect(toList());
}
