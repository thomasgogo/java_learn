import java.beans.XMLEncoder;

public class Message {
    private String content;

    public synchronized void send(String message) throws InterruptedException {
        if(content != null) {
            wait();
        }

        content = message;
        notify();
    }

    public synchronized String receive() throws InterruptedException {
        if (content == null) {
            wait();
        }

        String message = content;
        content = null;
        notify();
        return message;
    }
}
