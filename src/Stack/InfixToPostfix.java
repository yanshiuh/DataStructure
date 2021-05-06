package Stack;

import java.util.Stack;

public class InfixToPostfix {

    public static String infixToPostfix(String infix) {
        Stack<Character> operator = new Stack<>();
        String postfix = "";
        for (int i = 0; i < infix.length(); i++) {
            if (Character.isLetterOrDigit(infix.charAt(i)))
                postfix += infix.charAt(i);
            else if (isOperator(infix.charAt(i))) {
                if (operator.isEmpty() || !higherPriority(operator.peek(), infix.charAt(i)))
                    operator.push(infix.charAt(i));
            }

            if (infix.charAt(i) == '(')
                operator.push(infix.charAt(i));

            if (infix.charAt(i) == ')' ||
                    isOperator(infix.charAt(i)) && higherPriority(operator.peek(), infix.charAt(i))) {
                while (!operator.isEmpty()) {
                    if (operator.peek() == '(') {
                        operator.pop();
                        break;
                    }
                    postfix += operator.pop();
                }
                if (infix.charAt(i) != ')')
                    operator.push(infix.charAt(i));
            }
        }
        while (!operator.isEmpty())
            postfix += operator.pop();

        return postfix;
    }

    public static boolean higherPriority(char opInStack, char operator) {
        if (opInStack == '*' || opInStack == '/')
            return operator == '+' || operator == '-';

        return false;
    }

    public static boolean isOperator(char op) {
        return op == '*' || op == '/' || op == '+' || op == '-';
    }

    public static void main(String[] args) {
        String infix = "A+B*C";
        System.out.println(infixToPostfix(infix));
    }
}
