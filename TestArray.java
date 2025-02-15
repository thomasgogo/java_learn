import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArray {

    public static void main(String[] args) {
        Array[] arrayName = new Array[3];

        String[] names = {"Alice", "Bob", "Charlie"};

        int[] numbers = {1, 2, 3, 4, 5};

        int firstNumber = numbers[0];
        int thirdNumber = numbers[2];

        numbers[1] = 10;
        for (int number : numbers) {
            System.out.println(number);
        }

        int length = numbers.length;

        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);
        }

        //for( dataType element: arrayName) {
        //      使用element 访问当前元素
        //}

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int element = matrix[1][1];
        System.out.println(element);

        for(int i=0; i<matrix.length; i++){
            int[] row = matrix[i];
            for(int j =0; j < row.length; j ++){
                System.out.println("第" + (i + 1) + "行，第" + (j + 1) + "列的元素是：" + row[j]);
            }
        }
        int[] numbers1 = {5, 2, 8, 1, 9};
        Arrays.sort(numbers1);
        System.out.println(numbers1);
        for(int num: numbers1){
            System.out.println(num);
        }
        int[] numbers2 = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(numbers2, 3);
        System.out.println(index);

        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[5];
        System.arraycopy(source, 0, destination, 0 , 5);
        System.out.println(destination);
        for(int des: destination){
            System.out.println(des);
        }

        int[] numbers3 = {25, 30, 35, 40, 45};
        int sum = 0;

        for(int number: numbers3){
            sum += number;
        }

        double average = (double) sum / numbers3.length;
        System.out.println("数组的平均值为：" + average);





    }
}
