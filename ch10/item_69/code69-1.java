// 코드 69-1 예외를 완전히 잘못 사용한 예 - 따라 하지 말 것!

try {
    int i = 0;
    while(true)
	range[i++].climb();
} catch (ArrayIndexOutOfBoundsException e) {
}
