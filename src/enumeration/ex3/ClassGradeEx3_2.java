package enumeration.ex3;

//클래스타입으로 사용할떄의 한계
public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        //Enum type은 private 생성자가 있다고 보면됨 따라서 new 생성 불가
        //Grade grade = new Grade();
    }
}
