package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할수 있다.
        Address a = new Address("서울"); //x001
        Address b = a; //x001 // 이렇게 작성하면 사이드이펙트 날수 있는데.. 자바 문법상 막을 방법이 없음!
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
