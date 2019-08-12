// 코드 89-1 잘못된 싱글턴 - transient가 아닌 참조 필드를 가지고 있다!

public class Elvis implements Serializable {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() { }

    private String[] favoriteSongs =
        { "Hound Dog", "Heartbreak Hotel" };
    public void printFavorites() {
	System.out.println(Arrays.toString(favoriteSongs));
    }

    private Object readResolve() {
	return INSTANCE;
    }
}
