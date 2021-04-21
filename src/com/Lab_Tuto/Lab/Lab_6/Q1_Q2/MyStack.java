package com.Lab_Tuto.Lab.Lab_6.Q1_Q2;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E> {
    private List<E> list = new ArrayList<>();

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        return list.remove(list.size() - 1);

//        E remove = list.get(list.size() - 1);
//        list.remove(list.size() - 1);
//        return remove;
    }

    public E peek() {
        return list.get(list.size() - 1);
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return "Stack: " + list.toString();
    }

    public boolean search(E o) {
        if (!isEmpty()) {
            return list.contains(o);
        }
        return false;
    }
}
