// 코드 6-1 성능을 훨씬 더 끌어올릴 수 있다!

static boolean isRomanNumeral(String s) {
    return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
		     + "(X[CL]|L?X{0,#})(I[XV]|V?I{0,3})$");
}
