package com.Lab_Tuto.Lab.Lab_4;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;

        if (tail == null)
            tail = head;
    }

    public void addLast(E e) {
        if (tail == null)
            head = tail = new Node<>(e);
        else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index == 0)
            addFirst(e);
        else if (index >= size)
            addLast(e);
        else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
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
            Node<E> temp = tail;
            tail = head = null;
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;
            for (int i = 1; i < size - 1; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
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
        else if (index < 0 || index >= size)
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

    public void add(E e) {
        if (size == 0) {
            head = new Node<>(e);
            tail = head;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(e);
            tail = current.next;
        }
        size++;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) return true;
            current = current.next;
        }
        return false;
    }

    public E get(int index) {
        if (head != null) {
            int count = 0;
            Node<E> current = head;
            while (current != null) {
                if (index == count)
                    return current.element;
                current = current.next;
                count++;
            }
        } else {
            System.out.println("List is empty");
        }
        return null;
//
//        if (index == 0)
//            getFirst();
//        else if (index == size - 1)
//            getLast();
//        else if (index < 0 || index >= size)
//            return null;
//        else {
//            Node<E> current = head;
//            for (int i = 1; i <= index; i++) {
//                current = current.next;
//            }
//            return current.element;
//        }
//        return null;
    }

    public E getFirst() {
        if (head != null)
            return (E) head.element;
        else {
            System.out.println("\nList is empty");
            return null;
        }
    }

    public E getLast() {
        if (head != null) {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            return current.element;
        } else {
            System.out.println("List is empty");
            return null;
        }
    }

    public int indexOf(E e) {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e))
                return count;
            current = current.next;
            count++;
        }
        System.out.println("List is empty");
        return -1;
    }

    public int lastIndexOf(E e) {
        List<Integer> occurrence = new ArrayList<>();
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(e))
                occurrence.add(count);
            current = current.next;
            count++;
        }
        return occurrence.get(occurrence.size() - 1);
    }

    public E set(int index, E e) {
        if (index == 0)
            head.element = e;
        else if (index == size - 1)
            tail.element = e;
        else if (index < 0 || index >= size)
            return null;
        else {
            Node<E> current = head;
            for (int i = 1; i <= index; i++)
                current = current.next;
            current.element = e;
            return current.element;
        }
        return null;
    }

    public void clear() {
        head = tail = null;
        size = 0;
//        if (size == 0)
//            System.out.println("List is empty");
//        else if (size == 1) {
//            head = tail = null;
//            size = 0;
//        } else {
//            Node<E> current = head;
//            while (current != null) {
//                Node<E> temp = current;
//                current = null;
//                size--;
//                current = temp.next;
//            }
//        }
    }

    public void print() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        for (int i = size - 1; i >= 0; i--)
            System.out.print(get(i) + " ");
    }

    public E getMiddleValue() {
        // 1st method
        return get(size / 2 );

        // 2nd method
//        if (head != null) {
//            Node<E> slower = head;
//            Node<E> faster = head;
//            while (faster != null && faster.next != null) {
//                faster = faster.next.next;
//                slower = slower.next;
//            }
//            return slower.element;
//        } else {
//            System.out.println("List is empty");
//            return null;
//        }

        // 3rd method
//        int index = size / 2;
//        Node<E> current = head;
//        for (int i = 0; i < index; i++) {
//            current = current.next;
//        }
//        Node<E> temp = current.next;
//        return temp.element;
    }
}
