import java.util.*;

public class structreExample {
    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }

    public static void main(String[] args) {
        Season currentSeason = Season.SUMMER;
        System.out.println(currentSeason);

        BitSet bitSet = new BitSet();
        bitSet.set(2);
        bitSet.set(5, true);

        bitSet.clear(2);
        boolean value = bitSet.get(5);
        System.out.println(value);
        System.out.println(bitSet);

        // 向量
        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");

        String element = vector.get(0);
        System.out.println(vector);
        System.out.println(element);

        vector.remove(1);
        System.out.println(vector);

        // 栈
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");

        String element1 = stack.pop();

        String topElement = stack.peek();

        System.out.println(stack);
        System.out.println(element1);
        System.out.println(topElement);

        // 字典
        Dictionary<String, Integer> directory = new Hashtable<>();

        directory.put("Java", 1);
        directory.put("Python", 2);

        int value1 = directory.get("Java");
        System.out.println(value1);

        directory.remove("Python");

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Java", 1);
        hashtable.put("Python", 2);

        int value2 = hashtable.get("Java");
        hashtable.remove("Python");
        System.out.println(hashtable);

        Properties properties = new Properties();

        properties.setProperty("language", "Java");
        properties.setProperty("language", "Python");

        String value3 = properties.getProperty("language");
        System.out.println(properties);
        properties.remove("language");
        System.out.println(properties);

    }
}
