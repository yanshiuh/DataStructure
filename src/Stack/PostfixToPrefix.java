package Stack;

import java.util.Stack;

public class PostfixToPrefix {

    public static String postfixToPrefix(String postfix) {
        Stack<String> expression = new Stack<>();
        String prefix = "";
        for (int i = 0; i < postfix.length(); i++) {
            if (Character.isLetterOrDigit(postfix.charAt(i))) {
                expression.push(postfix.charAt(i) + "");
            } else {
                String operand_1 = expression.pop();
                String operand_2 = expression.pop();
                String temp = postfix.charAt(i) + operand_2 + operand_1;
                expression.push(temp);
            }
        }
        while (!expression.isEmpty())
            prefix += expression.pop();

        return prefix;
    }

    public static void main(String[] args) {
        String postfix = "AB+CD-*";
        System.out.println(postfixToPrefix(postfix));
    }
}
