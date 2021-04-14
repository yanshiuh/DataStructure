package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q2;

public abstract class ArrayStack<E> {
    protected int maxSize = 10;

    public ArrayStack() {};
    public abstract boolean isEmpty();
    public abstract boolean isFull();
    public abstract int getSize();
    public abstract void push(E e);
    public abstract E pop();
    public abstract E peek();
    public abstract void showStack();
}
