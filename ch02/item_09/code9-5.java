// 코드 9-5 try-with-resources를 catch 절과 함께 쓰는 모습

static String firstLineOfFile(String path, String defaultVal) {
    try (BufferedReader br = new BufferedReader(
	     new FileReader(path))) {
	return br.readLine();
    } catch (IOException e) {
	return defaultVal;
    }
}
