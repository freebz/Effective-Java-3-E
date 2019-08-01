// 코드 48-3 소수 계산 스트림 파이프라인 - 병렬화 버전

static long pi(long n) {
    return LongStream.rangeClosed(2, n)
	.parallel()
	.mapToObj(BigInteger::valueOf)
	.filter(i -> i.isProbablePrime(50))
	.count();
}
