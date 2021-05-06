package Stack;

import java.util.Stack;

public class PrefixToInfix {

    public static String prefixToInfix(String prefix) {
        Stack<String> expression = new Stack<>();
        String infix = "";
        for (int i = prefix.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(prefix.charAt(i)))
                expression.push(prefix.charAt(i) + "");
            else {
                String operand_1 = expression.pop();
                String operand_2 = expression.pop();
                String exp = "(" + operand_1 + prefix.charAt(i) + operand_2 + ")";
                expression.push(exp);
            }
        }
        while (!expression.isEmpty())
            infix += expression.pop();

        return infix;
    }

    public static void main(String[] args) {
        String prefix = "*-A/BC-/AKL";
        System.out.println(prefixToInfix(prefix));
    }
}
