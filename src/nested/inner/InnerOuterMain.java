package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        //new InnerOuter().Inner(); 이렇게 생성 못함.

        System.out.println(inner.getClass());
    }
}
