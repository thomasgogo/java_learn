import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("element: " + element);
        }
        for(String string: list) {
            System.out.println("string: " + string);

        }
    }
}
