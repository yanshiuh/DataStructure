package com.Lab_Tuto.Lab.Lab_2.Q2;

public class MyGeneric<E> {
    private E e;

    public MyGeneric() {
    }

    public MyGeneric(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
