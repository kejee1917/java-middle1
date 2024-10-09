package lang.object.toString;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //1.toString() 반환값 출력
        System.out.println(string);

        //2.object 직접 출력
        System.out.println(object);

        //왜 1,2의 출력값이 동일할까?
        //println에 내부적으로 toString() 메소드 호출한다.
        //그래서 객체를 바로 전달하면 객체의 정보 출력 가능.
    }
}
