package Generic;

public class Main_Test_T {

    public static void main(String[] args) {
        Test_T<Integer> integer = new Test_T<>(123);
        Test_T<String> string = new Test_T<>("Kys");

        System.out.println(integer.getT());
        System.out.println(string.toString());
    }
}
