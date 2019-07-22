// 코드 10-2 잘못된 코드 - 대칭성 위배!

@Override public boolean equals(Object o) {
    if (!(o instanceof ColorPoint))
	return false;
    return super.equals(o) && ((ColorPoint) o).color == color;
}
