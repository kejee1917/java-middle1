package exception.basic.unchecked;


public class Client {

    public void call() {

        //problem
        throw new MyUnCheckedException("ex");
    }
}
