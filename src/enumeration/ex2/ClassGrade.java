package enumeration.ex2;

public class ClassGrade {

    //static 이기 때문에 로딩시점에 메모리에 올라감
    public static final ClassGrade BASIC = new ClassGrade(); //x001
    public static final ClassGrade GOLD = new ClassGrade(); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(); //x003

    //private 생성자 추가해서 외부 생성 못하게 막기
    private ClassGrade() {}
}
