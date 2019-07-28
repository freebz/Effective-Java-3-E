// 코드 28-1 런타임에 실패한다.

Object[] objectArray = new Long[1];
objectArray[0] = "타입이 달라 넣을 수 없다."; // ArrayStoreException을 던진다.
