package com.Lab_Tuto.Tuto_from_snr.Tuto_5;

import com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q1.Stack;

import java.util.Random;

public class Q6 {

    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[10];
        int x = 0;
        while (x < numbers.length){
            int num = r.nextInt(101);
            if (!repeat(num, numbers)) {
                numbers[x] = num;
                x++;
            }
        }

        int even = 0, odd = 0;
        for (int n : numbers) {
            if (n % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even + "  Odd: " + odd);

        int totalElementInStack;
        if (even < odd) totalElementInStack = even + (even + 1);
        else if (odd < even) totalElementInStack = odd + odd;
        else totalElementInStack = odd + even;

        Stack<Integer> stack = new Stack<>();
        while (stack.getSize() != totalElementInStack) {
            for (int i = 0; i < numbers.length; i++) {
                if (stack.getIndex() % 2 == 0 && numbers[i] % 2 != 0 && !stack.contains(numbers[i]))
                    stack.push(numbers[i]);
                else if (stack.getIndex() % 2 != 0 && numbers[i] % 2 == 0 && !stack.contains(numbers[i]))
                    stack.push(numbers[i]);
            }
        }

        for (int i: numbers)
            System.out.print(i + " ");
        System.out.println();

        stack.showStack();
        System.out.println(stack.getSize());
    }

    public static boolean repeat(int num, int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            if (num == numbers[i]) return true;
        return false;
    }
}
