// ㅗ드 37-3 스트림을 사용한 코드 1 - EnumMap을 사용하지 않는다!

System.out.println(Arrays.stream(garden)
	.collect(groupingBy(p -> p.lifeCycle)));
