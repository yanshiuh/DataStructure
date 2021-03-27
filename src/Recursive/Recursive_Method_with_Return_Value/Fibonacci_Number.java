package Recursive.Recursive_Method_with_Return_Value;

public class Fibonacci_Number {

    public static void main(String[] args) {
        int index = 5;
        System.out.println("The Fibonacci number at index " + index + " : " + fib(index));
    }

    public static int fib(int n) {
        if (n == 0)          // base case
            return 0;
        else if (n == 1)     // base case
            return 1;
        else                 // reduction & recursive call
            return fib(n - 1) + fib(n - 2);
    }
}
