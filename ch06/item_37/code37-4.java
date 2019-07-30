// 코드 37-4 스트림을 사용한 코드 2 - EnumMap을 이용해 데이터와 열거 타입을 매핑했다.

System.out.println(Arrays.stream(garden)
	.collect(groupingBy(p -> p.lifeCycle,
	    () -> new EnumMap<>(LifeCycle.class), toSet())));
