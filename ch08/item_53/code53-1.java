// 코드 53-1 간단한 가변인수 활용 예

static int sum(int... args) {
    int sum = 0;
    for (int arg : args)
	sum += arg;
    return sum;
}
