public static BigInteger safeInstance(BigInteger val) {
    return val.getClass() == BigInteger.class ?
	val : new BigInteger(val.toByteArray());
}
