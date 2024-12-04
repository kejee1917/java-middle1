package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료"); //밖으로 던졌기 떄문에 이건 출력 안됨.
     }
}
