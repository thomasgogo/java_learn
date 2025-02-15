import java.io.File;

public class DeleteDirectoryExample {
    public static void main(String[] args) {
        String directoryPath = "src";
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()){
            if (directory.delete()) {
                System.out.println("目录已成功删除! ");
            } else {
                System.out.println("无法删除目录! ");
            }
        } else {
            System.out.println("目录不存在! ");
        }


    }
}
