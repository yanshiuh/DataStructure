package Stack;

import java.util.Stack;

public class Postfix_Prefix_Calculation {

    public static String infixToPostfix(String exp) {
        Stack<String> operators = new Stack<>();
        String postfixExp = "";
        for (int i = 0; i < exp.length(); i++) {
            if (Character.isLetterOrDigit(exp.charAt(i)))
                postfixExp += exp.charAt(i);
            else if (isOperator(exp.charAt(i))) {
                while (!operators.isEmpty() && !operators.peek().equals("(")
                        && hasHigherPrecedence(operators.peek(), exp.charAt(i))) {
                    postfixExp += operators.pop();
                }
                operators.push(exp.charAt(i) + "");
            } else if (exp.charAt(i) == '(')
                operators.push(exp.charAt(i) + "");
            else if (exp.charAt(i) == ')') {
                while (!operators.isEmpty() && !operators.peek().equals("(")) {
                    postfixExp += operators.peek();
                    operators.pop();
                }
                operators.pop();
            }
        }
        while (!operators.isEmpty())
            postfixExp += operators.pop();

        return postfixExp;
    }

    public static boolean isOperator(char op) {
        return op == '*' || op == '/' || op == '+' || op == '-';
    }

    public static boolean hasHigherPrecedence(String operatorInStack, char operatorInExp) {
        if (operatorInStack.equals("*") || operatorInStack.equals("/")) {
            if (operatorInExp == '+' || operatorInExp == '-')
                return true;
        }

        if (operatorInStack.equals("+") || operatorInStack.equals("-"))
            return true;

        return false;
    }

    public static int postfix(String exp) {     // from left tot right
        Stack<String> operand = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if (Character.isDigit(exp.charAt(i)))
                operand.push(exp.charAt(i) + "");
            else {
                int op1 = Integer.parseInt(operand.pop());
                int op2 = Integer.parseInt(operand.pop());
                int r = calculation(exp.charAt(i), op2, op1);
                operand.push(Integer.toString(r));
            }
        }
        return Integer.parseInt(operand.peek());
    }

    public static int prefix(String exp) {  // from right to left
        Stack<String> operand = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            if (Character.isDigit(exp.charAt(i)))
                operand.push(exp.charAt(i) + "");
            else {
                int op1 = Integer.parseInt(operand.pop());
                int op2 = Integer.parseInt(operand.pop());
                int r = calculation(exp.charAt(i), op1, op2);
                operand.push(Integer.toString(r));
            }
        }
        return Integer.parseInt(operand.peek());
    }

    public static int calculation(char operator, int a, int b) {
        if (operator == '+')
            return a + b;
        else if (operator == '-')
            return a - b;
        else if (operator == '*')
            return a * b;
        else if (operator == '/')
            return a / b;
        else if (operator == '%')
            return a % b;

        return 0;
    }

    public static void main(String[] args) {
        String infix = "3*(7+1)";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Calculate result using postfix: " + postfix(postfix));


//        String post = "23*54*+9-";
//        System.out.println(postfix(post));
//
//        String pre = "-+*23*549";
//        System.out.println(prefix(pre));
    }
}
