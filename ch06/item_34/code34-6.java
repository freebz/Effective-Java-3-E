// 코드 34-6 상수별 클래스 몸체(class body)와 데이터를 사용한 열거 타입

public enum Operation {
    PLUS("+") {
	public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
	public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
	public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
	public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;

    Operation(String symbol) { this.symbol = symbol; }

    @Override public String toString() { return symbol; }
    public abstract double apply(double x, double y);
}
