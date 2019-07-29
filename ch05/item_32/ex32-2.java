aduience = flatten(List.of(friends, romans, countrymen));


static <T> List<T> pickTwo(T a, T b, T c) {
    switch(ThreadLocalRandom.current().nextInt(3)) {
      case 0: return List.of(a, b);
      case 1: return List.of(a, c);
      case 2: return List.of(b, c);
    }
    throw new AssertionError();
}


public static void main(String[] args) {
    List<String> attributes = pickTwo("좋은", "빠른", "저렴한");
}
