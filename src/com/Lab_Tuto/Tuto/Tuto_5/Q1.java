package com.Lab_Tuto.Tuto.Tuto_5;

public class Q1<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    // b) The purpose of this code is to set new value at the specified index of node meanwhile return
    //    the old value of the node

    public E xyz(int index, E e) {
        if (index == 0) {
            Node<E> temp = head;
            head.element = e;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++)
                current = current.next;
            Node<E> temp = current.next;
            current.next.element = e;
            return temp.element;
        }
    }

    public E abc(int index, E e) {
        if (index >= 0 && index < size) {
            Node<E> current = head;
            Node<E> temp;
            for (int i = 0; i <= index; i++) {
                if (index > 0) current = current.next;
                else {
                    temp = head;
                    head.element = e;
                    return temp.element;
                }
            }
            temp = current.next;
            current.next.element = e;
            return temp.element;
        }
        return null;
    }
}
