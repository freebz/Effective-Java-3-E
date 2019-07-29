// 코드 33-1 타입 안전 이종 컨테이너 패턴 - API

public class Favorites {
    public <T> void putFavorite(Class<T> type, T instance);
    public <T> T getFavorite(Class<T> type);
}
