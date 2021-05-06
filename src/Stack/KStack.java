package Stack;

import java.util.Arrays;

public class KStack<E> {
    private E[] array;
    private int[] indexes;
    private int numberOfStack;
    private int stackSize;

    public KStack(int numberOfStack, int stackSize) {
        this.numberOfStack = numberOfStack;
        this.stackSize = stackSize;

        array = (E[]) new Object[numberOfStack * stackSize];
        indexes = new int[numberOfStack];
        int j = -1;
        for (int i = 0; i < indexes.length; i++) {
                indexes[i] = j;
                j += stackSize;
        }
    }

    public boolean isFull(int stack) {
        int index = 0;
        int j = 1;
        while (j < stack) {
            index += stackSize;
            j++;
        }
        // index = the first position (0) of the specific stack

        int i = 0;
        while (i < stackSize) {
            if (array[index] == null)  // if one of the element is null, thus the stack is not full
                return false;
            i++;
            index++;
        }

        return true;
    }

    public boolean isEmpty(int stack) {
        int index = 0;
        int j = 1;
        while (j < stack) {
            index += stackSize;
            j++;
        }
        // index = the first position (0) in the specific stack

        return array[index] == null;  // if the first element is null, thus the stack is empty
    }

    public void push(E element, int stack) {
        if (isFull(stack))
            System.out.println("The stack is full");

        indexes[stack - 1]++;
        int index = indexes[stack - 1];
        array[index] = element;
    }

    public E pop(int stack) {
        if (isEmpty(stack)) {
            System.out.println("The stack is empty");
            return null;
        }

        int index = indexes[stack - 1];
        E r = array[index];
        array[index] = null;

        return r;
    }

    public void display(int stack) {
        int index = 0;
        int j = 1;
        while (j < stack) {
            index += stackSize;
            j++;
        }
        System.out.println("Stack " + stack + ": ");
        for (int i = 0; i < stackSize; i++) {
            if (array[index] == null) break;
            System.out.print(array[index] + " --> ");
            index++;
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        KStack<Integer> a = new KStack<>(3, 3);
        a.push(1,1);
        a.push(11,1);

        a.push(2,2);
        a.push(22,2);

        a.push(3,3);
        a.push(33, 3);

        a.pop(1);

        a.display(1);
        a.display(2);
        a.display(3);
    }
}
