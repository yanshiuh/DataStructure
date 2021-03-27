package Generic;

public class Main_Pair_K_V {

    public static void main(String[] args) {
        Pair_K_V<Integer, String> p1 = new Pair_K_V<>(1,"apple");
        Pair_K_V<Integer, String> p2 = new Pair_K_V<>(2,"pear");
        boolean compare = Util.compare(p1,p2);

        System.out.println(compare);
    }
}
