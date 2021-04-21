package com.Lab_Tuto.Lab.Lab_5.Q3;

public class doublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public doublyLinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    public void addFirst(E e) {
        if (size == 0)
            head = tail = new Node<>(e, null , null);
        else {
            Node<E> newNode = new Node<>(e, head, null);
            Node<E> current = head;
            head.prev = newNode;
            head = head.prev;
            head.next = current;
        }
//        Node<E> temp = new Node<E>(e, head, null);
//        if (head != null)
//            head.prev = temp;
//        head = temp;
//        if (tail == null)
//            tail = temp;
        size++;
        System.out.println("adding: " + e);
    }

    public void addLast(E e) {
        if (size == 0) {
            tail = head = new Node<>(e, null, null);
        } else {
            Node<E> newNode = new Node<>(e, null, tail);
            Node<E> current = tail;
            tail.next = newNode;
            tail = tail.next;
            tail.prev = current;
        }
//        Node<E> temp = new Node<E>(e, null, tail);
//        if (tail != null)
//            tail.next = temp;
//        tail = temp;
//        if (head == null)
//            head = temp;
        size++;
        System.out.println("adding: " + e);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Out of index");
        else if (index == 0)
            addFirst(e);
        else if (index == size)
            addLast(e);
        else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node<E> newNode = new Node<>(e, current, current.prev);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
            System.out.println("adding at index " + index + ": " + e);
        }
    }

    public E removeFirst() {
        if (size == 0)
            return null;

        Node<E> temp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: " + temp.element);
        return temp.element;
    }

    public E removeLast() {
        if (size == 0)
            return null;

        Node<E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("Deleted: " + temp.element);
        return temp.element;
    }

    public E remove(int index) {
        if (index < 0 || index >= size)
            return null;
        else if (index == 0)
            removeFirst();
        else if (index == size - 1)
            removeLast();
        else {
            Node<E> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.next = null;
            temp.prev = null;
            size--;
            System.out.println("Deleted: " + temp.element);
            return temp.element;
        }
        return null;
    }

    public void iterateForward() {
        System.out.println("iterate forward...");
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.next;
        }
    }

    public void iterateBackward() {
        System.out.println("iterate backward...");
        Node<E> current = tail;
        while (current != null) {
            System.out.print(current.element + " ");
            current = current.prev;
        }
    }

    public int getSize() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;

        //return size;
    }

    public void clear() {
        Node<E> current = head;
        while (head != null) {
            current = head.next;
            head.prev = head.next = null;
            head = current;
        }
        current = null;
        tail.prev = tail.next = null;
        System.out.println("Successfully clear " + size + " node(s)");
        size = 0;
    }
}
