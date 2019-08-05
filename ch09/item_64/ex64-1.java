// 좋은 예. 인터페이스를 타입으로 사용했다.
Set<Son> sonSet = new LinkedHashSet<>();


// 나쁜 예. 클래스를 타입으로 사용했다!
LinkedHashSet<Son> sonSet = new LinkedHashSet<>();


Set<Son> sonSet = new HashSet<>();
