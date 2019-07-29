// 코드 34-10 switch 문을 이용해 원래 열거 타입에 없는 기능을 수행한다.

public static Operation inverse(Operation op) {
    switch(op) {
        case PLUS:   return Operation.MINUS;
        case MINUS:  return Operation.PLUS;
        case TIMES:  return Operation.DIVIDE;
        case DIVIDE: return Operation.TIMES;

        defualt: throw new AssertionError("알 수 없는 연산: " + op);
    }
}
