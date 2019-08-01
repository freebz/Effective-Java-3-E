// 코드 48-2 소수 계산 스트림 파이프라인 - 병렬화에 적합하다.

static long pi(long n) {
    return LongStream.rangeClosed(2, n)
	.mapToObj(BigInteger::valueOf)
	.filter(i -> i.isProbablePrime(50))
	.count();
}
