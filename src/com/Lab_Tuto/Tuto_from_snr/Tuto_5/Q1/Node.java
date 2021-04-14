package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q1;

public class Node<E> {
    E element;
    Node<E> next;

    public Node() {
    }

    public Node(E element) {
        this.element = element;
    }

    public Node(E element, Node<E> next) {
        this.element = element;
        this.next = next;
    }

    @Override
    public String toString() {
        return " <-- " + element;
    }
}
