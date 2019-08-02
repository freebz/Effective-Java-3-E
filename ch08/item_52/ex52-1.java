public static String clasify(Collection<?> c) {
    return c instanceof Set ? "집합" :
	   c instanceof List ? "리스트" : "그 외";
}
