package exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException {

        //problem
        throw new MyCheckedException("ex");
    }
}
