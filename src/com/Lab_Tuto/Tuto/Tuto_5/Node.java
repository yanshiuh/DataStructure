package com.Lab_Tuto.Tuto.Tuto_5;

public class Node<E> {
    E element;
    Node<E> prev;
    Node<E> next;

    public Node(E element, Node<E> prev, Node<E> next) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }

    public Node(E element) {
        this.element = element;
    }
}
