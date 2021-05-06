package Stack.QueueUsingStack;

import java.util.Stack;

public class QueueByStack<E> {
    private Stack<E> s1 = new Stack<>();
    private Stack<E> s2 = new Stack<>();

    public QueueByStack() {
    }

    public void enqueue(E element) {
        while (!s1.isEmpty())
            s2.push(s1.pop());

        s1.push(element);

        while (!s2.isEmpty())
            s1.push(s2.pop());
    }

    public E dequeue() {
        if (s1.isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        }

        return s1.pop();
    }

    public int getSize() {
        return s1.size();
    }

    @Override
    public String toString() {
        return s1.toString();
    }
}
