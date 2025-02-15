import java.io.*;
import java.net.Socket;

public class RemoteTransferExample {
    public static void main(String[] args) {
        StudentExample studentExample = new StudentExample("王五", 22);

        String hostname = "localhost";
        int port = 12345;

        try {
            Socket socket = new Socket(hostname, port);

            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(outputStream);
            out.writeObject(studentExample);

            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String response = reader.readLine();
            System.out.println("服务器返回消息: " + response);

            out.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
