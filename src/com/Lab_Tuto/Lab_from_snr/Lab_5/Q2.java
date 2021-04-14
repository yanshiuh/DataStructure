package com.Lab_Tuto.Lab_from_snr.Lab_5;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        String[] infixArray = expression.split(" ");

        String infix = infix(infixArray);
        System.out.println(infix);

        String postfix = postfix(infix);
        System.out.println(postfix);
    }

    public static char operator(String op) {
        char operator = ' ';
        switch (op) {
            case "add":
                operator = '+';
                break;
            case "sub":
                operator = '-';
                break;
            case "mul":
                operator = '*';
                break;
            case "div":
                operator = '/';
                break;
            case "mod":
                operator = '%';
                break;
            case "ob":
                operator = '(';
                break;
            case "cb":
                operator = ')';
                break;
        }
        return operator;
    }

    public static int getPriority(char op) {
        switch (op) {
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    public static String infix(String[] expression) {
        String infix = "";
        for (String s : expression) {
            if (Character.isDigit(s.charAt(0)))
                infix += s;
            else
                infix += operator(s);
        }
        return infix;
    }

    public static String postfix(String infix) {
        String postfix = "";
        char c = ' ';
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            if (Character.isLetterOrDigit(infix.charAt(i)))
                postfix += infix.charAt(i);
            else if (infix.charAt(i) == '(')
                stack.push(infix.charAt(i));
            else if (infix.charAt(i) == ')') {
                c = stack.pop();
                while (c != '(') {
                    postfix += c;
                    c = stack.pop();
                }
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek() != '(')
                        stack.push(infix.charAt(i));
                    else {
                        c = stack.peek();
                        while (getPriority(infix.charAt(i)) < getPriority(c)) {
                            postfix += stack.pop();
                            if (!stack.isEmpty()) {
                                c = stack.peek();
                                if (c == '(')
                                    break;
                            } else
                                break;
                        }
                        stack.push(infix.charAt(i));
                    }
                } else stack.push(infix.charAt(i));
            }
        }
        while (!stack.isEmpty())
            postfix += stack.pop();

        return postfix;
    }
}
