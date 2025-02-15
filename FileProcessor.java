import java.io.*;
import java.util.Scanner;

public class FileProcessor {
    public static void readTextFile(String filePath) {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("读取文件时发生错误：" + e.getMessage());
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("关闭文件时发生错误：" + e.getMessage());
                }
            } else {
                System.out.println("bufferedReader: " + bufferedReader);
            }
        }
    }

    public static int divide(int diviend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("除数不能为零! ");
        }
        return diviend / divisor;
    }


    public static void main(String[] args) throws FileNotFoundException {
        //FileProcessor fp = new FileProcessor();

        readTextFile("src/input1.txt");

        try {
            int divide = divide(12, 3);
            System.out.println(divide);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        String str = null;
        //System.out.println(str.length());

        int[] arr = {1, 2, 4};
        //System.out.println(arr[3]);

        int a = 10/0;
        //System.out.println(a);

        File file = new File("not_exist.txt");
        Scanner scanner = new Scanner(file);

        String str1 = "abc";
        //int num  = Integer.parseInt(st1);
        //System.out.println(num);




    }
}
