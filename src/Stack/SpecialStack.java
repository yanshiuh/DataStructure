package Stack;

import java.util.Stack;

public class SpecialStack {

    private Stack<Integer> s1 = new Stack<>();
    private int min;

    public SpecialStack() {
    }

    public void push(int number) {
        if (s1.isEmpty() || number < min) {
            s1.push(number);
            min = s1.peek();
        }
    }

    public int getMin() {
        return s1.peek();
    }

    public static void main(String[] args) {
        SpecialStack a = new SpecialStack();
        int[] numbers = {18, 19, 29, 15, 16};
        for (int i = 0; i < numbers.length; i++)
            a.push(numbers[i]);

        System.out.println("Min: " + a.getMin());
    }
}
