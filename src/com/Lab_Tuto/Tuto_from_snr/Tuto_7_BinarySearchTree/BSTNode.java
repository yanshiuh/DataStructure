package com.Lab_Tuto.Tuto_from_snr.Tuto_7_BinarySearchTree;

public class BSTNode<T extends Comparable<T>> {
    private T data;
    private BSTNode<T> leftLink;
    private BSTNode<T> rightLink;

    public BSTNode() {
        data = null;
        leftLink = null;
        rightLink = null;
    }

    public BSTNode(T data, BSTNode<T> leftLink, BSTNode<T> rightLink) {
        this.data = data;
        this.leftLink = leftLink;
        this.rightLink = rightLink;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTNode<T> getLeftLink() {
        return leftLink;
    }

    public void setLeftLink(BSTNode<T> leftLink) {
        this.leftLink = leftLink;
    }

    public BSTNode<T> getRightLink() {
        return rightLink;
    }

    public void setRightLink(BSTNode<T> rightLink) {
        this.rightLink = rightLink;
    }

    @Override
    public String toString() {
        return data + " --> ";
    }
}
