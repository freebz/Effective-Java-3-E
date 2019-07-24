// 코드 17-2 생성자 대신 정적 팩터리를 사용한 불변 클래스

public class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
	this.re = re;
	this.im = im;
    }

    public static Complex valueOf(double re, double im) {
	return new Complex(re, im);
    }

    ... // 나머지 코드는 생략
}
