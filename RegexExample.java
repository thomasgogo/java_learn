import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Hello, my name is John. My email is john@example.com.";
        String regex = "\\w+@\\w+\\.\\w+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String email = matcher.group();
            System.out.println("Email: " + email);
        }

        String regex1 = "1[34578]\\d{9}";
        String regex2 = "\\d{17}[\\d|x]|\\d{15}";
        String regex3 = "\\w+@\\w+\\.\\w+";
        String regex4 = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";
        String regex5 = "\\d{4}-\\d{2}-\\d{2}";

        int result = sum(5, 10);
        System.out.println(result);

        int ax = factorial(8);
        System.out.println(ax);

    }
    public static int sum(int a , int b) {
        int result = a + b;
        return result;
    }

    public static double sum(double a, double b){
        return  a + b;
    }

    public static int factorial(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n -1);
        }
    }

    public static int getMax(int a, int b){
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
