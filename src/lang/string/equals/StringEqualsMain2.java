package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello"; //문자열 pool
        String str4 = "hello"; //문자열 pool
        System.out.println("메서드 호출 비교2: " + isSame(str1, str2));

    }

    private static boolean isSame(String x, String y) {
        //return x==y; 문자열 비교는 항상 ==비교하면 안됨! 리터럴이 들어올지 new로 만든 객체가 들어올지 모르기때문.
        return x.equals(y);
    }
}
