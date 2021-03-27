package Generic;

public class Main_Test_T_U {

    public static void main(String[] args) {
        String[] friends = {"Ali", "John", "Suren"};
        Test_T_U<Integer,String> a = new Test_T_U<>(friends.length, friends);

        System.out.println(a.toString());
    }
}
