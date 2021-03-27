package com.Lab_Tuto.Lab_from_snr.Lab_4.Q7_Q8;

public class ListNode<T> {
    private T data;
    private ListNode<T> link;

    public ListNode(T data, ListNode<T> link) {
        this.data = data;
        this.link = link;
    }

    public ListNode() {
        data = null;
        link = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getLink() {
        return link;
    }

    public void setLink(ListNode<T> link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return data + " --> ";
    }
}
