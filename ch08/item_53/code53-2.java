// 코드 53-2 인수가 1개 이상이어야 하는 가변인수 메서드 - 잘못 구현한 예!

static int min(int... args) {
    if (args.length == 0)
	throw new IllegalArguemntException("인수가 1개 이상 필요합니다.");
    int min = args[0];
    for (int i = 1; i < args.length; i++)
	if (args[i] < min)
	    min = args[i];
    return min;
}
