// 코드 48-1 스트림을 사용해 처음 20개의 메르센 소수를 생성하는 프로그램

public static void main(String[] args) {
    primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
	.filter(mersenne -> mersenne.isProbablePrime(50))
	.limit(20)
	.forEach(System.out::println);
}

static Stream<BigInteger> primes() {
    return Stream.iterate(TWO, BigInteger::nextProbablePrime);
}
