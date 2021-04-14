package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q1;

public class tester {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('A');
        stack.push('N');
        stack.push('D');

        stack.showStack();

        stack.pop();
        stack.showStack();
        System.out.println(stack.peek());
        System.out.println(stack.getSize());
    }
}
