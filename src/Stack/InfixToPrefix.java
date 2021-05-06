package Stack;

import java.util.Stack;

public class InfixToPrefix {

    public static String infixToPrefix(String infix) {
        String reverse = "";
        for (int i = infix.length() - 1; i >= 0; i--) {// reverse the infix
            if (infix.charAt(i) == '(') {
                reverse += ")";
                break;
            }
            if (infix.charAt(i) == ')') {
                reverse += "(";
                break;
            }
            reverse += infix.charAt(i);
        }

        Stack<Character> operator = new Stack<>(); // convert reverse to postfix
        String postfix = "";
        for (int i = 0; i < reverse.length(); i++) {
            if (Character.isLetterOrDigit(reverse.charAt(i)))
                postfix += reverse.charAt(i);
            else if (isOperator(reverse.charAt(i))) {
                if (operator.isEmpty() || !higherPriority(operator.peek(), reverse.charAt(i))) {
                    operator.push(reverse.charAt(i));
                }
            }

            if (reverse.charAt(i) == '(')
                operator.push(reverse.charAt(i));

            if (reverse.charAt(i) == ')' ||
            isOperator(reverse.charAt(i)) && higherPriority(operator.peek(), reverse.charAt(i)) ) {
                while (!operator.isEmpty()) {
                    if (operator.peek() == '(') {
                        operator.pop();
                        break;
                    }
                    postfix += operator.pop();
                }
                if (infix.charAt(i) != ')')
                    operator.push(reverse.charAt(i));
            }
        }
        while (!operator.isEmpty())
            postfix += operator.pop();

        String prefix = "";
        for (int i = postfix.length() - 1; i >= 0; i--) { // reverse the postfix become prefix
            prefix += postfix.charAt(i);
        }

        return prefix;
    }

    public static boolean isOperator(char op) {
        return op == '*' || op == '/' || op == '+' || op == '-';
    }

    public static boolean higherPriority(char opInStack, char operator) {
        if (opInStack == '*' || opInStack == '/')
            return operator == '+' || operator == '-';

        return false;
    }

    public static void main(String[] args) {
        String infix = "A+B*C";
        System.out.println(infixToPrefix(infix));
    }
}
