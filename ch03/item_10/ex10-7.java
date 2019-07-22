// 단위 원 안의 모든 점을 포함하도록 unitCircle을 초기화한다.
private static final Set<Point> unitCircle = Set.of(
    new Point( 1, 0), new Point( 0, 1),
    new Point(-1, 0), new Point( 0, -1));

public static boolean onUnitCircle(Point p) {
    return unitCircle.contains(p);
}
