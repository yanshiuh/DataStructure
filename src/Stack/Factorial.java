package Stack;

import java.util.Stack;

public class Factorial {

    public static int fac(int n) {
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            stack.push(n);
            n--;
        }

        int sum = 1;
        while (!stack.isEmpty())
            sum *= stack.pop();

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
