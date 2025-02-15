import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("src/myfile.txt");

        try {
            boolean success = file.createNewFile();
            if (success){
                System.out.println(("文件创建成功"));
            } else{
                System.out.println(("文件创建失败"));
            }

            File newfile = new File("src/newfile.txt");
            boolean success1 = file.renameTo(newfile);
            if (success1) {
                System.out.println("文件重命名成功");
            } else {
                System.out.println("文件重命名失败");
            }

            boolean success2 = newfile.delete();
            if (success2) {
                System.out.println("文件删除成功");
            } else {
                System.out.println("文件删除失败");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
