package com.Lab_Tuto.Lab.Lab_7.Q3;

import java.util.LinkedList;

public class MyQueue<E extends Number> {
    LinkedList<E> list = new LinkedList<>();

    public MyQueue() {
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

    public E set(int index, E element) {
        E temp = list.get(0);
        list.set(index, element);

        return temp;
    }

    public void display(String queue) {
        System.out.print("Queue for " + queue + ": {");
        for (int i = 0 ; i < list.size(); i++) {
            if (i == 0) System.out.print(list.get(i));
            else System.out.print(", " + list.get(i));
        }
        System.out.print("}\n");
    }
}
