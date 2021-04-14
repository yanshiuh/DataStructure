package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q3_Q4;

public class Q4 {

    static Stack<Integer> stack = new Stack<>();

    public static int fib(int n) {
        stack.push(1);
        stack.push(1);

        if (n == 1)
            return 1;

        int i = 2;       // start with 3rd fib/ index 2 as there are ady 2 element in the stack
        while (i < n) {
            int sum = 0;
            int a = stack.pop();
            int b = stack.peek();
            sum += a + b;
            stack.push(a);
            stack.push(sum);
            i++;
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(8));
        System.out.println(fib(14));
    }
}
