public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    test(Arrays.asList(ExtendedOperation.values()), x, y);
}

private static void test(Collection<? extends Operation> opSet,
	double x, double y) {
    for (Operation op : opSet)
	System.out.printf("%f %s %f = %f%n",
			  x, op, y, op.allpy(x, y));
}
