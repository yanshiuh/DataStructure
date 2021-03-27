package com.Lab_Tuto.Lab_from_snr.Lab_4.Q6;

public class DoubleListNode<T> {
    private T data;
    private DoubleListNode<T> previousLink;
    private DoubleListNode<T> nextLink;

    public DoubleListNode() {
        data = null;
        previousLink = null;
        nextLink = null;
    }

    public DoubleListNode(T data, DoubleListNode<T> previousLink, DoubleListNode<T> nextLink) {
        this.data = data;
        this.previousLink = previousLink;
        this.nextLink = nextLink;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoubleListNode<T> getPreviousLink() {
        return previousLink;
    }

    public void setPreviousLink(DoubleListNode<T> previousLink) {
        this.previousLink = previousLink;
    }

    public DoubleListNode<T> getNextLink() {
        return nextLink;
    }

    public void setNextLink(DoubleListNode<T> nextLink) {
        this.nextLink = nextLink;
    }

    public void setLink(DoubleListNode<T> previousLink, DoubleListNode<T> nextLink) {
        this.previousLink = previousLink;
        this.nextLink = nextLink;
    }

    @Override
    public String toString() {
        return " <-- " + data + " --> ";
    }
}
