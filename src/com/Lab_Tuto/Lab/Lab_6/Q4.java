package com.Lab_Tuto.Lab.Lab_6;

import java.util.Stack;
import com.Lab_Tuto.Lab.Lab_6.*;

public class Q4 {

    public static boolean palindrome(String s) {
        if (s.length() > 15) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)    // insert all char in stack
            stack.push(s.charAt(i));

        for (int i = 0; i < s.length(); i++)
            if (stack.peek() == s.charAt(i))    // start from beginning of string check with the stack
                stack.pop();

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "123321";
        System.out.println(palindrome(s));
    }
}
