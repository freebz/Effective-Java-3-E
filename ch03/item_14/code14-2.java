// 코드 14-2 기본 타입 필드가 여럿일 때의 비교자

public int compareTo(PhoneNumber pn) {
    int result = Short.compare(areaCode, pn.areaCode);   // 가장 중요한 필드
    if (result == 0) {
	result = Short.compare(prefix, pn.prefix);       // 두 번째로 중요한 필드
	if (result == 0)
	    result = Short.compare(lineNum, pn.lineNum); // 세 번째로 중요한 필드
    }
    return result;
}
