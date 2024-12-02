package nested.nested.ex1;

// Network 객체 안에서만 사용한다고 가정
public class NetworkMessage {

    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println(content);
    }
}
