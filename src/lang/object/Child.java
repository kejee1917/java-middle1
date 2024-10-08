package lang.object;

//명시적으로 상속받았기에 Object Class 상속 안받음!
public class Child extends Parent{

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
