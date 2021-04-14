package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q2;

public class ArrayStackImplementation<E> extends ArrayStack<E> {
    private E[] array = (E[]) new Object[maxSize];
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == maxSize;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(Object e) {
        array[size] = (E)e;
        size++;
    }
    //abstract class and interface is different, below works in interface but not here
//    @Override
//    public void push(E e) {
//        array[size] = e;
//        size++;
//    }

    @Override
    public E pop() {
        E temp = array[size - 1];
        array[size - 1] = null;
        size--;
        return temp;
    }

    @Override
    public E peek() {
        return array[size - 1];
    }

    @Override
    public void showStack() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(" <-- " + array[i]);
        }
        System.out.println();
    }
}
