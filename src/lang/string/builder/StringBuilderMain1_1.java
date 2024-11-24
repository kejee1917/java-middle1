package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");

        System.out.println("sb= " + sb);

        sb.insert(3, "Java");
        System.out.println("insert= " + sb);

        sb.delete(2, 3);
        System.out.println("delete=" + sb);

        sb.reverse();
        System.out.println("reverse= " + sb);
        //StringBuilder는 가변이라서 반환값으로 출력안해도 됨.

        //가변 -> 불변(String)
        String string = sb.toString();
        System.out.println("불변 String= " + string);

    }
}
