package Recursive.Recursive_Method_with_Return_Value;

import java.util.Random;

public class Example_1_factorial {

    public static void main(String[] args) {
        System.out.println("Factorial of " + 10 + " is " + factorial(10));
    }

    public static long factorial(int n) {
        if (n == 0)                          // base call
            return 1;
        else
            return n * factorial(n - 1);  // recursive call
    }
}
