package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    //catch 잡아서 해결
    public void callCatch() {
        try {
            client.call(); //여기서 예외 터지면
        } catch (MyUnCheckedException e) { // 잡음!
            //예외 처리 로직
            System.out.println("예외처리, message = " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    //밖으로 던지기
    public void catchThrow() {
        client.call();
    }
}
