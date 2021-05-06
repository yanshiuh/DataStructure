package Stack.ArrayStackImp;

import java.util.Arrays;

public class ArrayStack<E> {
    private E[] stack;
    private int index;
    private final int MAX_CAPACITY = 20;
    private E top;

    public ArrayStack() {
        index = -1;
        stack = (E[]) new Object[MAX_CAPACITY];
    }

    public void push(E element) {
        if (index < MAX_CAPACITY - 1)
            stack[++index] = top = element;
        else
            System.out.println("The stack is full");
    }

    public void extend() {
        E[] newStack = (E[]) new Object[stack.length + MAX_CAPACITY];
        for (int i = 0; i < stack.length; i++)
            newStack[i] = stack[i];

        stack = newStack;
    }

    public E pop() {
        E r = top;
        stack[index] = null;
        top = stack[index - 1];

        return r;
    }

    public E peek() {
        return top;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean contains(E element) {
        for (int i = 0; i < stack.length; i++)
            if (stack[i] == element)
                return true;

        return false;
    }

    public int search(E element) {
        for (int i = 0; i < stack.length; i++)
            if (stack[i] == element)
                return i;

        return -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("(bottom) ");
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] != null)
                result.append(stack[i] + " --> ");
        }
        result.append("(top)");

        return result.toString();
    }
}
