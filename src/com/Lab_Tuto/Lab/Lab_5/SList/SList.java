package com.Lab_Tuto.Lab.Lab_5.SList;

public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;

    public SList() {
        size = 0;
        head = null;
        tail = null;
    }

    public void appendEnd(E e) {
        if (size == 0)
            head = tail = new SNode<E>(e);
        else {
            tail.next = new SNode<>(e);
            tail = tail.next;
        }
        size++;
    }

    public E removeInitial() {
        if (size == 0)
            return null;
        else {
            SNode<E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }

    public boolean contains(E e) {
        SNode<E> current = head;
        while (current != null) {
            if (current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("The list is empty");
    }

    public void display() {
        SNode<E> current = head;
        for (int i = 0; i < size; i++) {
            if (i == size - 1)
                System.out.print(current.element + ".");
            else
                System.out.print(current.element + ", ");
            current = current.next;
        }
    }
}
