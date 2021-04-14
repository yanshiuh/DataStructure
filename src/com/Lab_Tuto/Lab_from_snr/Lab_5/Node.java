package com.Lab_Tuto.Lab_from_snr.Lab_5;

public class Node<E> {
    E element;
    Node<E> next;

    public Node() { }

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    @Override
    public String toString() {
        return " <-- " + element;
    }
}
