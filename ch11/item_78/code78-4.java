// 코드 78-4 잘못된 코드 - 동기화가 필요하다!

private static volatile int nextSerialNumber = 0;

public static int generateSerialNumber() {
    return nextSerialNumber++;
}
