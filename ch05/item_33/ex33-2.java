Favorites f = new Favorites();

List<String> pets = Arrays.asList("개", "고양이", "앵무");

f.putFavorite(new TypeRef<List<String>>(){}, pets);
List<String> listofStrings = f.getFavorite(new TypeRef<List<String>>(){});
