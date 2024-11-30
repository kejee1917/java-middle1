package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("REF = " + Grade.BASIC); //BASIC -> Enum은 toString()을 오버라이딩 해놓음
    }

    //참조값 출력하기
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
