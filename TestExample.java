import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestExample {
    public static void main(String[] args) {
        StudentExample studentExample = new StudentExample("张三", 20);

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(studentExample);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
