import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Go");

        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            if(element.equals("Go")) {
                System.out.println("element: " + element);
                iterator.remove();
            }
        }

        System.out.println("list: " + list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("Go");

        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Orange");
        set1.add("Banana");

        Iterator<String> iterator1 = list1.iterator();
        Iterator<String> iterator2 = set1.iterator();

        while(iterator1.hasNext() && iterator2.hasNext()) {
            String element1 = iterator1.next();
            String element2 = iterator2.next();
            System.out.println(element1 + " - " + element2);
        }



    }
}
