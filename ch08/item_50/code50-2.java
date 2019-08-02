// 코드 50-2 Period 인스턴스의 내부를 공격해보자.

Date start = new Date();
Date end = new Date();
Period p = new Period(start, end);
end.setYear(78); // p의 내부를 수정했다!
