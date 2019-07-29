// 코드 33-4 동적 형변환으로 런타임 타입 안전성 확보

public <T> void putFavorite(Class<T> type, T instance) {
    favorites.put(Objects.requireNonNull(type), type.cast(instance));
}
