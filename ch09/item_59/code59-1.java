// 코드 59-1 흔하지만 문제가 심각한 코드!

static Random rnd = new Random();

static int random(int n) {
    return Math.abs(rnd.nextInt()) % n;
}
