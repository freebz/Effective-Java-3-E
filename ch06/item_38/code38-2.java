// 코드 38-2 확장 가능 열거 타입

public enum ExtendedOperation implements Operation {
    EXP("^") {
	public double apply(double x, double y) {
	    return Math.pow(x, y);
	}
    },
    REMAINDER("%") {
	public double apply(double x, double y) {
	    return x % y;
	}
    };

    private final String symbol;

    ExtendedOperation(String symbol) {
	this.symbol = symbol;
    }

    @Oberride public String toString() {
	return symbol;
    }
}
