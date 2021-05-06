package com.Lab_Tuto.Tuto_from_snr.Tuto_7_BinarySearchTree;

public abstract class ArrayBST<T extends Comparable<T>> {
    public ArrayBST() {}
    public abstract boolean isEmpty();
    public abstract int getSize();
    public abstract int getHeight();
    public abstract void addNote(T t);
    public abstract void inOrder();
    public abstract void preOrder();
    public abstract void postOrder();
    public abstract T removeNode(T t);
}
