// 코드 9-1 try-finally - 더 이상 자원을 회수하는 최선의 방책이 아니다!

static String firstLineOfFile(String path) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(path));
    try {
	return br.readLine();
    } finally {
	br.close();
    }
}
