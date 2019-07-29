// 코드 34-4 값에 따라 분기하는 열거 타입 - 이대로 만족하는가?

public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    // 상수가 뜻하는 연산을 수행한다.
    public double apply(double x, double y) {
	switch(this) {
  	    case PLUS:   return x + y;
	    case MINUS:  return x - y;
	    case TIMES:  return x * y;
	    case DIVIDE: return x / y;
	}
	throw new AssertionError("알 수 없는 연산: " + this);
    }
}
