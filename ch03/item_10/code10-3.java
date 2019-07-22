// 코드 10-3 잘못된 코드 - 추이성 위배!

@Override public boolean equals(Object o) {
    if (!(o instanceof Point))
	return false;

    // o가 일반 Point면 색상을 무시하고 비교한다
    if (!(o instanceof ColorPoint))
	return o.equals(this);

    // o가 ColorPoint면 색상까지 비교한다.
    return super.equals(o) && ((ColorPoint) o).color == color;
}
