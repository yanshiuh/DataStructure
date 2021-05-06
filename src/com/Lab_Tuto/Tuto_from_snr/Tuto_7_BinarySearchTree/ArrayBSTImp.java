package com.Lab_Tuto.Tuto_from_snr.Tuto_7_BinarySearchTree;

public class ArrayBSTImp<T extends Comparable<T>> extends ArrayBST<T> {

    int maxSize = 20;
    int index = -1;
    int height = 0;
    int root = 0;
    T[] tree;

    public ArrayBSTImp() {
        tree = (T[]) new Comparable[maxSize];
    }

    @Override
    public boolean isEmpty() {
        return index == -1;
    }

    @Override
    public int getSize() {
        return index + 1;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void addNote(T t) {
        add(root, t);
    }

    public void add(int index, T t) {
        index = index + 1;
        if (tree[index] == null)
            tree[index] = t;
        else if (t.compareTo(tree[index]) <= 0)
            add(2 * index + 2, t);
        else if (t.compareTo(tree[index]) > 0)
            add(2 * index + 1, t);
    }

    BST.Queue<T> Q;

    public void setOrder(int x) {
        if (x == 1)
            inOrder();
    }

    @Override
    public void inOrder() {

    }

    @Override
    public void preOrder() {

    }

    @Override
    public void postOrder() {

    }

    @Override
    public T removeNode(T t) {
        return null;
    }
}
