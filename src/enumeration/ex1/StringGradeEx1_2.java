package enumeration.ex1;


public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 저렇게 상수로 정의해놔도 결국엔 파라미터에 String을 넣을 수 있다.
        discountService.discount("String", price);
    }
}
