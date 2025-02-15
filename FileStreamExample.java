import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("src/input.txt");

            FileOutputStream output = new FileOutputStream("src/output.txt");

            int data;
            while((data = input.read()) != -1){
                output.write(data);
            }
            output.write("---- 我是副本".getBytes());

            input.close();
            output.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
