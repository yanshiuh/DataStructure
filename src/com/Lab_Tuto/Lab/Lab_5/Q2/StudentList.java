package com.Lab_Tuto.Lab.Lab_5.Q2;

public class StudentList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public StudentList() {
        size = 0;
        head = null;
        tail = null;
    }

    public void add(E e) {
        if (size == 0)
            head = tail = new Node<>(e);
        else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    public void removeElement(E e) {
        boolean contains = false;
        Node<E> current = head;
        while (current != null) {
            if (current.next != null) {
                if (current.next.element.equals(e)) {
                    contains = true;
                    current.next = current.next.next;
                    size--;
                }
            }
            current = current.next;
        }
        if (!contains)
            System.out.println("The list does not consist the element");
    }

    public void printList() {
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            if (i == size - 1)
                System.out.print(current.element + ".");
            else
                System.out.print(current.element + ", ");
            current = current.next;
        }
        System.out.println();
    }

    public int getSize() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;

        // return size;
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

    public void replace(E e, E newE) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e))
                current.element = newE;
            current = current.next;
        }
    }
}
