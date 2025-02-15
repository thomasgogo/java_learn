import java.util.Arrays;
import java.util.Locale;

public class InstanceVariables {
    int num = 10;

    void exampleMethod(Integer num) {
        System.out.println(num);
    }

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.num);

        obj.exampleMethod(obj.num);


        String str1 = "Hello";
        String str2 = "world";

        String str = new String("Hello world");

        String result = str1 + " " + str2;
        String result1 = str1.concat(" ").concat(str2);

        System.out.println(str);
        System.out.println(result);
        System.out.println(result1);

        boolean isEqual1 = str1.equals(str2);
        int compareResult = str1.compareTo(str2);

        System.out.println(isEqual1);
        System.out.println(compareResult);

        String str3 = "Hello World";
        int index1 = str3.indexOf("H");
        boolean containResult = str.contains("Hello");

        System.out.println(index1);
        System.out.println(containResult);


        String str4 = "Hello World";
        int length = str4.length();
        System.out.println(length);

        String str5 = "Hello";
        char ch = str5.charAt(1);
        System.out.println(ch);

        String str6 = "Hello World";
        String sub1 = str6.substring(6);
        String sub2 = str6.substring(0,6);
        System.out.println(sub1);
        System.out.println(sub2);

        String str7 = "Hello World";
        String lowerCase = str7.toLowerCase();
        String lowerCase1 = str7.toLowerCase(Locale.ROOT);

        String upperCase = str7.toUpperCase();
        String upperCase1 = str7.toUpperCase(Locale.ROOT);

        System.out.println(lowerCase);
        System.out.println(lowerCase1);
        System.out.println(upperCase);
        System.out.println(upperCase1);


        String str8 = "Hello World";
        String replacedStr = str8.replace("World", "Java");
        System.out.println(replacedStr);

        boolean empty = str8.isEmpty();
        System.out.println(empty);

        String result3 = str8.concat("Hello");
        System.out.println(result3);

        String[] arr = str8.split(" ");
        System.out.println(arr[0]);
//        for(int i =0 ; i <= arr.length; i ++){
//            System.out.println(arr[i]);
//        }
        for (String world: arr){
            System.out.println(world);
        }

        int lastIndex = str8.lastIndexOf('W');
        int lastIndex1 = str8.lastIndexOf("Hello");

        System.out.println(lastIndex);
        System.out.println(lastIndex1);

        boolean startsWith = str8.startsWith("World");
        boolean startsWith1 = str8.startsWith("World", 6);
        System.out.println(startsWith);
        System.out.println(startsWith1);

        boolean endWith = str8.endsWith("World");
        System.out.println(endWith);

        boolean containsWith = str8.contains("O");
        System.out.println(containsWith);

        boolean equalsIgnoreCase = str8.equalsIgnoreCase("world");
        System.out.println(equalsIgnoreCase);

        char[] charArray = str8.toCharArray();
        System.out.println(charArray);

        byte[] byteArray = str8.getBytes();
        System.out.println(byteArray);
        for( byte b: byteArray){
            System.out.println(b);
        }

        String trimStr = str8.trim();
        System.out.println(trimStr);

        String str9 = String.valueOf('a');
        String str10 = String.valueOf(10);
        String str11 = String.valueOf(100L);
        String str12 = String.valueOf(3.14f);
        String str13 = String.valueOf(3.14);
        System.out.println(str9);
        System.out.println(str10);
        System.out.println(str11);
        System.out.println(str12);
        System.out.println(str13);



        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println(sb);

        sb.insert(5, " Java");
        System.out.println(sb);
        sb.delete(6,10);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        char c = sb.charAt(0);
        System.out.println(c);

        int len = sb.length();
        System.out.println(len);




    }
}
