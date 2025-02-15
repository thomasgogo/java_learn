import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryExample {
    public static void main(String[] args) {
        String directoryPath = "directory";

        try {
            Path path = Paths.get(directoryPath);
            Files.createDirectory(path);
            System.out.println("目录已成功创建! ");
        } catch (IOException e){
            System.out.println("无法创建目录: " + e.getMessage());
        }
    }
}
