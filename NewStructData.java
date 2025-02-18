import java.util.*;

public class NewStructData {
    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }

    public static void main(String[] args) {
        Season  currentSeason = Season.AUTUMN;
        System.out.println("当前季节是: " + currentSeason);

        // 位集合
        BitSet bitSet = new BitSet();

        bitSet.set(2);
        bitSet.set(5, true);
        bitSet.clear(2);
        boolean value = bitSet.get(5);

        System.out.println("value is " + value);


        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");

        String element = vector.get(0);
        vector.remove(1);
        System.out.println("element is " + element);

        // 栈 后进先出的数据结构,它只能在栈顶进行插入和删除操作.
        Stack<String> stack = new Stack<>();
        stack.push("Java");
        stack.push("Python");

        String element1 = stack.pop();
        System.out.println("element1 is "  + element1);
        String topElement = stack.peek();
        System.out.println("topElement is " + topElement);

        // 字典是一种键值对的数据结构, 它提供了根据健查找值的能力
        Dictionary<String, Integer> dictionary = new Hashtable<>();
        dictionary.put("Java", 1);
        dictionary.put("Python", 2);

        int value1 = dictionary.get("Java");
        System.out.println("value1 is " + value1);



//        dictionary.remove("Python");

        // Hashtable 是一种使用哈希函数进行关键字映射的数据结构, 它提供了快速的查找和插入操作.
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Java", 1);
        hashtable.put("Python", 2);

        int value2 = hashtable.get("Java");
        hashtable.remove("Python");
        System.out.println("value2 is " + value2);


        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        Properties properties = new Properties();
        properties.setProperty("language", "Java");
        properties.setProperty("language", "Python");
        String value3 = properties.getProperty("language");
        System.out.println("value3 is " + value3);
//        properties.remove("language");
        System.out.println(properties);




    }
}

