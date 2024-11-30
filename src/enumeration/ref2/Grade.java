package enumeration.ref2;

//enum도 클래스다!
//원하는 상수의 이름을 나열하면 끝
//public class Grade extends Enum
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30); //x001, x002, x003

    private final int discountPercent;

    // private이 숨겨져 있다고 생각해라
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가
    public int discount(int price) {
        return price + discountPercent / 100;
    }
}
