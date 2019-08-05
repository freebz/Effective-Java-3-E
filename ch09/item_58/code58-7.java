// 코드 58-7 컬렉션이나 배열의 중첩 반복을 위한 권장 관용구

for (Suit suit : suits)
    for (Rank rank : ranks)
	deck.add(new Card(suit, rank));
