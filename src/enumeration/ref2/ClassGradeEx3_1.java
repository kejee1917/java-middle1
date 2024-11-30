package enumeration.ref2;

import enumeration.ex3.DiscountService;
import enumeration.ex3.Grade;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(enumeration.ex3.Grade.BASIC, price);
        int gold = discountService.discount(enumeration.ex3.Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);
    }
}
