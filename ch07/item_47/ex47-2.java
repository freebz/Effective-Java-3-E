for (int start = 0; start < src.size(); start++)
    for (int end = start + 1; end <= src.size(); end++)
	System.out.println(src.subList(start, end));
