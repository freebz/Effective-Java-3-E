// 코드 28-2 컴파일되지 않는다!

List<Object> ol = new ArrayList<Long>(); // 호환되지 않는 타입이다.
ol.add("타입이 달라 넣을 수 없다.");
