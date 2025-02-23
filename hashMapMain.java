import java.util.HashMap;
import java.util.Map;

public class hashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);

        int value = hashMap.get("banana");
        System.out.println("The value of key 'banana' is:  " + value);

        hashMap.remove("cherry");

        System.out.println("hashmap is: " + hashMap);

        for(String key: hashMap.keySet()){
            System.out.println("key: " + key);
        }

        for(Integer value1: hashMap.values()) {
            System.out.println("value: " + value1);
        }

        for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        boolean containKey = hashMap.containsKey("Banana");
        System.out.println("containKey is: " + containKey);

        boolean containValue = hashMap.containsValue(2);
        System.out.println("containValue is: " + containValue);

        hashMap.put("null", 1000);
        System.out.println("size: " + hashMap.size());
        //hashMap.clear();
        //System.out.println("size: " + hashMap.size());
        System.out.println(hashMap);




    }
}
