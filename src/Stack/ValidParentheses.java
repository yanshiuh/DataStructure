package Stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean validParentheses(String input) {
        if (isClosing(input.charAt(0)) || isOpening(input.charAt(input.length() - 1)))
            return false;

        Stack<Character> temp = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (isOpening(input.charAt(i)))
                temp.push(input.charAt(i));
            else {
                if (isCompatible(temp.peek(), input.charAt(i)))
                    temp.pop();
                else
                    break;
            }
        }

        return temp.isEmpty();
    }

    public static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isClosing(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    public static boolean isCompatible(char fromStack, char fromInput) {
        if (fromStack == '(' && fromInput == ')')
            return true;
        else if (fromStack == '{' && fromInput == '}')
            return true;
        else if (fromStack == '[' && fromInput == ']')
            return true;

        return false;
    }

    public static void main(String[] args) {
        String input = "[()]{}{[()()]()}";
        System.out.println(validParentheses(input));
    }
}
