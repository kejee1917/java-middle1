package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str = "hello";
        String concat = str.concat("java");

        System.out.println(concat);
        //String은 불변객체이다. 따라서 변경이 필요한 경우 기존 값을 변경하지 않고 대신에 새로운 결과를 만들어서 반환!
    }
}
