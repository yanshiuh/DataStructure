package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q1;

public class Stack<E> {
    Node<E> head;
    private int index = 0;

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
        index++;
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
        System.out.println();
    }

    public int getIndex() {
        return index;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }
}
