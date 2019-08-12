public static void main(String[] args) {
    MutablePeriod mp = new MutablePeriod();
    Period p = mp.period;
    Date pEnd = mp.end;

    // 시간을 되돌리자!
    pEnd.setYear(78);
    System.out.println(p);

    // 60년대로 회귀!
    pEnd.setYear(69);
    System.out.println(p);
}
