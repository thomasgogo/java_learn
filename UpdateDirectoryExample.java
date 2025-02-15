import java.io.File;

public class UpdateDirectoryExample {
    public static void main(String[] args) {
        String directoryPath = "src";
        String newDirectoryName = "new_directory_name";

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()){
            String newDirectoryPath = directory.getParent() + File.separator + newDirectoryName;
            File newDirectory = new File(newDirectoryPath);

            if (directory.renameTo(newDirectory)){
                System.out.println("目录创建成功");
            } else {
                System.err.println("无法更新目录! ");
            }
        } else {
            System.err.println("目录不存在! ");
        }
    }
}
