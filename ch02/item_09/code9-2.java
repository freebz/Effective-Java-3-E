// 코드 9-2 자원이 둘 이상이면 try-finally 방식은 너무 지저분하다!

static void copy(String src, String dst) throws IOException {
    InputStream in = new FileInputStream(src);
    try {
	OutputStream out = new FileOUtputStream(dst);
	try {
	    byte[] buf = new byte[UBFFER_SIZE];
	    int n;
	    while ((n = in.read(buf)) >= 0)
		out.write(buf, 0, n);
	} finally {
	    out.close();
	}
    } finally {
	in.close();
    }
}
