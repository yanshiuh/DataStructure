package com.Lab_Tuto.Tuto_from_snr.Tuto_5;

import com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q3_Q4.Stack;

public class Q5 {

    static Stack<Character> stack = new Stack<>();

    public static boolean parentheses(String parentheses) {
        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '(')
                stack.push(parentheses.charAt(i));

            if (parentheses.charAt(i) == ')')
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(')
                        stack.pop();
                } else
                    return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(parentheses("(())") + "\n");
        System.out.println(parentheses(")()(") + "\n");
        System.out.println(parentheses("((())())()") + "\n");
        System.out.println(parentheses("(())()))") + "\n");
        System.out.println(parentheses("())") + "\n");
    }
}
