// 코드 87-1 기본 직렬화 형태에 적합한 후보

public class Name implements Serializable {
    /**
     * 성. null이 아니어야 함.
     * @serial
     */
    private final String lastName;

    /**
     * 이름. null이 아니어야 함.
     * @serial
     */
    private final String firstName;

    /**
     * 중간이름. 중간이름이 없다면 null.
     * @serial
     */
    private final String middleName;

    ... // 나머지 코드는 생략
}
