import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestExample1 {
    public static void main(String[] args) {
        StudentExample studentExample = null;

        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            studentExample = (StudentExample) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("xueshengxingming: " + studentExample.getName());
        System.out.println("xuesheng niling: " + studentExample.getAge());
    }
}
