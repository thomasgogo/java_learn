public class StringUtils {
    public static final String DEFAULT_STRING = "default";

    public static String reverse(String str) {
        StringBuilder builder = new StringBuilder(str);
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        String reversedStr = StringUtils.reverse("hello");
        System.out.println("Reversed string: " + reversedStr);

        System.out.println("Default string: " + StringUtils.DEFAULT_STRING);
    }


}
