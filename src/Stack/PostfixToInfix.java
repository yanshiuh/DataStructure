package Stack;

import java.util.Stack;

public class PostfixToInfix {

    public static String postfixToInfix(String postfix) {
        Stack<String> expression = new Stack<>();
        String infix = "";
        for (int i = 0; i < postfix.length(); i++) {
            if (Character.isLetterOrDigit(postfix.charAt(i)))
                expression.push(postfix.charAt(i) + "");
            else {
                String op1 = expression.pop();
                String op2 = expression.pop();
                String temp = "(" + op2 + postfix.charAt(i) + op1 + ")";
                expression.push(temp);
            }
        }
        while (!expression.isEmpty())
            infix += expression.pop();

        return infix;
    }

    public static void main(String[] args) {
        String postfix = "ab*c+";
        System.out.println(postfixToInfix(postfix));
    }
}
