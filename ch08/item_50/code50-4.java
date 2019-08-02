// 코드 50-4 Period 인스턴스를 향한 두 번째 공격

Date start = new Date();
Date end = new Date();
Period p = new Period(start, end);
p.end().setYear(78); // p의 내부를 변경했다!
