package com.Lab_Tuto.Lab.Lab_6.Q3;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> {
    private List<E> list = new ArrayList<>();

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E remove = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return remove;
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

    public int sum() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
            numbers.add((Integer) list.get(i));

        int sum = 0;
        for(Integer num: numbers)
            sum += num;

        return sum;
    }
}
