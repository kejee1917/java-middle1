package enumeration.ref1;

public class ClassGrade {

    //static 이기 때문에 로딩시점에 메모리에 올라감
    public static final ClassGrade BASIC = new ClassGrade(10); //x001
    public static final ClassGrade GOLD = new ClassGrade(20); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); //x003

    //불변
    private final int discountPercent;

    //private 생성자 추가해서 외부 생성 못하게 막기
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
