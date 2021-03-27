package Generic;

public class Util {
    public static <K, V> boolean compare(Pair_K_V<K, V> p1, Pair_K_V<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
