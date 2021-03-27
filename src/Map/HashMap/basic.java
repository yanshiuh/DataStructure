package Map.HashMap;

import java.util.*;

public class basic {

    public static void main(String[] args) {
        Map<Integer, String> mapHttpErrors = new HashMap<>();

        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(303, "See Other");
        mapHttpErrors.put(404, "Not found");
        mapHttpErrors.put(500, "Internal Server Error");

        System.out.println(mapHttpErrors);
        System.out.println(mapHttpErrors.get(200));   // return value
        System.out.println(mapHttpErrors.remove(404));  // return value (value doesn't matter)
        System.out.println(mapHttpErrors.remove(303, "See Other"));  // return boolean value

        // iterate
        Set<Integer> set = mapHttpErrors.keySet();
        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            int code = iterator.next();   // key
            String message = mapHttpErrors.get(code);  // value

            System.out.println(code + " --> " + message);
        }

        // HashMap is non thread-safe, so have to synchronize it
        // or use ConcurrentMap instead
        Map<Integer, String> safeMap = Collections.synchronizedMap(mapHttpErrors);
        Set<Integer> setSafeMap = safeMap.keySet();
        synchronized (safeMap) {
            Iterator<Integer> iterator1 = setSafeMap.iterator();
            // ....
        }
    }
}
