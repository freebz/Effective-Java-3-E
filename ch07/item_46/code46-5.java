// 코드 46-5 각 키와 해당 키의 특정 원소를 연관 짓는 맵을 생성하는 수집기

Map<Artist, Album> topHits = albums.collect(
    toMap(Album::artist, a->a, maxBy(comparing(Album::sales))));
