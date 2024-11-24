package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); //x001
        String str2 = new String("hello"); //x002
        System.out.println("==비교: " + (str1 == str2)); //false
        System.out.println("equals비교: " + str2.equals(str1)); //true

        String str3 = "hello"; //문자열 pool
        String str4 = "hello"; //문자열 pool
        System.out.println("리터럴 ==비교: " + (str3 == str4)); //true
        System.out.println("리터럴 equals비교: " + str3.equals(str4)); //true
    }
}
