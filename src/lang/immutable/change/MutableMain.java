package lang.immutable.change;

public class MutableMain {

    public static void main(String[] args) {
        MutableObj mutableObj = new MutableObj(10);
        mutableObj.add(23);

        //계산 이후 기존의 값은 사라짐
        System.out.println("obj = " + mutableObj.getValue());

    }
}
