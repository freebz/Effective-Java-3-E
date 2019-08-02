// 코드 55-5 옵셔널 활용 2 - 원하는 예외를 던질 수 있다.

Toy myToy = max(toys).orElseThrow(TemperTantrumException::new);
