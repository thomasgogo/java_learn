import java.io.File;
import java.io.IOException;

public class CreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("src/myfile.txt");

            boolean success = file.createNewFile();
            if (success){
                System.out.println("文件创建成功");
            } else  {
                System.out.println("文件创建失败");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        File file1 = new File("src/myfile.txt");

        boolean sucess1 = file1.delete();
        if (sucess1) {
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件删除失败");
        }
    }
}
