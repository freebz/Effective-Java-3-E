// 코드 54-6 나쁜 예 - 배열을 미리 할당하면 성능이 나빠진다.

return cheesesInStock.toArray(new Cheese[cheesesInStock.size()]);
