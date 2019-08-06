// 코드 73-3 예외 연쇄용 생성자

class HigherLevelException extends Exception {
    HigherLevelException(Throwable cause) {
	super(cause);
    }
}
