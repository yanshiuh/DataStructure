package com.Lab_Tuto.Tuto.Tuto_4;

import java.lang.annotation.Inherited;

public class MyLinkedList<E extends Comparable<E>> {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public MyLinkedList(E[] elements) {
        for (int i = 0 ; i < elements.length; i++) {
            add(i, elements[i]);
        }
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null)
            tail = head;
    }

    public void addLast(E element) {
        if (tail == null)
            head = tail = new Node<>(element);
        else {
            tail.next = new Node<>(element);
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E element) {
        if (index == 0)
            addFirst(element);
        else if (index >= size)
            addLast(element);
        else {
            Node<E> current = head;
            for (int i = 1; i < size; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(element);
            current.next.next = temp;
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0)
            return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null)
                tail = null;
            return temp.element;
        }
    }

    public E removeLast() {
        if (size == 0)
            return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 1; i < size - 1; i++) {  // stop 1 node before tail
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index) {
        if (index == 0)
            removeFirst();
        else if (index == size - 1)
            removeLast();
        else if (index > size)
            return null;
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = temp.next;
            size--;
            return temp.element;
        }
        return null;
    }


    // question 2
    // a) contains()
    // b)
    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e))
                return true;
            current = current.next;
        }
        return false;
    }


    // question 3
    // a) removeLast
    public E removeLast_Q3() {
        if (size == 0)
            return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> pointer1 = head;
            for (int i = 1; i < size - 1; i++) {
                pointer1 = pointer1.next;
            }
            Node<E> temp = tail;
            tail = pointer1;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
}
