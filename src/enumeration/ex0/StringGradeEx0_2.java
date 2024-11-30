package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //실수로 존재하지 않는 등급을 입력한다면?
        //int vip = discountService.discount("VIP", price);

        //실수로 오타
        //int bazic = discountService.discount("BAZIC", price);

        //소문자 입력
        //int gold = discountService.discount("gold", price);

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        System.out.println("BASIC " + basic);
        System.out.println("GOLD " + gold);
        System.out.println("DIAMOND " + diamond);
    }
}
