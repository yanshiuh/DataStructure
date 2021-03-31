package com.Lab_Tuto.Tuto.Tuto_5;

public class Q1<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // b) The purpose of this code is to set new element at the specified index of node

    public E xyz(int index, E e) {
        if (index == 0) {
            head.element = e;
            return head.element;
        } else if (index >= size || index < 0) {
            return null;
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            current.next.element = e;
            return current.next.element;
        }
    }
}
