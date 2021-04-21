package com.Lab_Tuto.Lab.Lab_7.Q1;

import java.util.LinkedList;

public class MyQueue<E> {
    LinkedList<E> list = new LinkedList<>();

    public MyQueue() {
    }

    public MyQueue(E[] e) {
        for (E element : e)
            list.addLast(element);
    }

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        E d = list.peek();
        list.removeFirst();
        return d;
    }

    public E getElement(int i) {
        return list.get(i);
    }

    public E peek() {
        return list.peek();
    }

    public int getSize() {
        return list.size();
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        String p = "";
        for (int i = 0; i < list.size(); i++) {
            p += list.get(i) + " --> ";
        }

        return p;
    }
}
