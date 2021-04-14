package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q3_Q4;

public class Stack<E> {
    Node<E> head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void push(E e) {
        head = new Node<>(e, head);
    }

    public E pop() {
        if (head == null)
            return null;
        E temp = head.element;
        head = head.next;
        return temp;
    }

    public E peek() {
        if (head == null)
            return null;
        else
            return head.element;
    }

    public void showStack() {
        if (isEmpty())
            System.out.println("The stack is empty");
        else {
            Node<E> current = head;
            while (current != null) {
                System.out.print(current);
                current = current.next;
            }
        }
    }
}
