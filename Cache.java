import java.util.HashMap;

public class Cache {
    private HashMap<String, Object> cacheMap;

    public Cache() {
        cacheMap = new HashMap<>();
    }

    public void put(String key, Object value){
        cacheMap.put(key, value);
    }

    public Object get(String key) {
        return cacheMap.get(key);
    }

    public void remove(String key){
        cacheMap.remove(key);
    }

    public void clear() {
        cacheMap.clear();
    }

    public static void main(String[] args) {
        Cache cache = new Cache();
        cache.put("result", "Hello world!");

        String result = (String) cache.get("result");
        System.out.println("缓存中的结果是: " + result);

    }
}
