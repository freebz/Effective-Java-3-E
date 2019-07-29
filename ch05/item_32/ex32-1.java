static <T> T[] pickTwo(T a, T b, T c) {
    switch(ThreadLocalRandom.current().nextInt(3)) {
      case 0: return toArray(a, b);
      case 1: return toArray(a, c);
      case 2: return toArray(b, c);
    }
    throw new AssertionError();  // 도달할 수 없다.
}



public static void main(String[] args) {
    String[] attributes = pickTwo("좋은", "빠른", "저렴한");
}
// ClassCastException
