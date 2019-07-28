// 코드 29-5 제네릭 Stack을 사용하는 맛보기 프로그램

public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    for (String arg : args)
	stack.push(arg);
    while (!stack.isEmpty())
	System.out.println(stack.pop().toUpperCase());
}
