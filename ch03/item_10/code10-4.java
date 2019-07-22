// 코드 10-4 잘못된 코드 - 리스코프 치환 원칙(59쪽) 위배!

@Override public boolean equals(Object o) {
    if (o == null || o.getClass() != getClass())
	return false;
    Point p = (Point) o;
    return p.x == x && p.y == y;
}
