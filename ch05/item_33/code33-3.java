// 코드 33-3 타입 안전 이종 컨테이너 패턴 - 구현

public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorite(Class<T> type, T instance) {
	favorites.put(Objects.requireNonNull(type), instance);
    }

    public <T> T getFavorite(Class<T> type) {
	return type.cast(favorites.get(type));
    }
}
