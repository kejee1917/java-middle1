package exception.ex1;


//실패해도 disconnect() 꼭 수행하기 (자원 반납하기)
public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data); //추가

        String connectResult = client.connect();
        if(isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        }else {
            String sendResult = client.send(data);
            if(isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        client.disconnect(); //이제 항상 호출!

        //음 그런데 정상흐름보다 예외흐름이 더 많고, 한눈에 들어오지 않는다!!
        // 이런 문제는 어떻게 해결할까?
    }


    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
