package lang.immutable.address;

//앞서 만들었던 Address class 를 불변클래스로 바꿔보자
public class ImmutableAddress {

    //사실 final 키워드가 없어도 setter가 없기 때문에 불변객체임!
    private final String value; //생성자를 통해서만 값 설정, 이후에 변경 불가

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
