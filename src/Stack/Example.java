package Stack;

import java.util.Stack;

public class Example {

    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();
        stack.push(1);  // add item/element
        stack.add("One");
        stack.add(2,"KD");

        //stack.pop();    // remove last element

        System.out.println(stack.peek());  // return last element

        System.out.println(stack);
    }
}
