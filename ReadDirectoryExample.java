import java.io.File;

public class ReadDirectoryExample {
    public static void main(String[] args) {
        String directoryPath = "src";

        File directory  = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()){
            File[] files = directory.listFiles();

            for(File file: files){
                System.out.println(file.getName());
            }
        } else {
            System.out.println("目录不存在! ");
        }

    }
}
