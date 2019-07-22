// 코드 11-3 한 줄짜리 hashCode 메서드 - 성능이 살짝 아쉽다.

@Override public int hashCode() {
    return Objects.hash(lineNum, prefix, areaCode);
}
