// 코드 9-3 try-with-resources - 자원을 회수하는 최선책!

static String firstLineOfFile(String path) throws IOException {
    try (BufferedReader br = new BufferedReader(
	     new FileReader(path))) {
	return br.readLine();
    }
}
