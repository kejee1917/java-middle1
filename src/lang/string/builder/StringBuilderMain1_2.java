package lang.string.builder;

//메서드 체이닝으로 변경해보기!
public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String string = sb.append("A").append("B").append("C")
                .insert(3, "Java")
                .delete(2, 3)
                .reverse().toString();

        System.out.println("불변 String= " + string);
    }
}
