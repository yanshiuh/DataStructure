package Recursion.Recursive_Method_with_Return_Value;

public class Example_2_power {

    public static void main(String[] args) {
        System.out.println(power(5,2));
    }

    public static int power(int num, int pow) {
        if (pow == 0)       // base case
            return 1;
        else                // reduce the pow and recursive call
            return num * power(num, pow - 1);
    }
}
