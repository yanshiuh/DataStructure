package Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void NGE(int[] numbers) {
        Stack<Integer> temp = new Stack<>();
        temp.push(numbers[0]);
        int next, element;
        for (int i = 1; i < numbers.length; i++) {
            next = numbers[i];
            if (!temp.isEmpty()) {
                element = temp.pop();
                while (next > element) {
                    System.out.println("NGE for " + element + " is " + next);
                    if (temp.isEmpty())
                        break;
                    element = temp.pop();
                }
                if (element > next)
                    temp.push(element);
            }
            temp.push(next);
        }
        while (!temp.isEmpty()) {
            next = -1;
            element = temp.pop();
            System.out.println("NGE for " + element + " is " + next);
        }
    }

    public static int numberOfNGE(int[] numbers, int index) {
        int count = 0;
        int element = numbers[index];
        for (int i = index + 1; i < numbers.length; i++) {
            int next = numbers[i];
            if (next > element)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        NGE(arr);

        System.out.println(numberOfNGE(arr,0));
    }
}
