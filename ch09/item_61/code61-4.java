// 코드 61-4 끔찍이 느리다! 객체가 만들어지는 위치를 찾았는가? - 코드 6-3과 같음

public static void main(String[] args) {
    Long sum = 0L;
    for (long i = 0; i <= Integer.MAX_VALUE; i++) {
	sum += i;
    }
    System.out.println(sum);
}
