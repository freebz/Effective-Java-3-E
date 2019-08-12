// 코드 89-4 역러 타입 싱글턴 - 전통적인 싱글턴보다 우수하다.

public enum Elvis {
    INSTANCE;
    private String[] favoriteSongs =
        { "Hound Dog", "Heartbreak Hotel" };
    public void printFavorites() {
	System.out.println(Arrays.toString(favoriteSongs));
    }
}
