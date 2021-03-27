package com.Lab_Tuto.Lab_from_snr.Lab_4.Q2;

public class ListNode<T> {
    private T data;
    private ListNode link;

    public ListNode(T data, ListNode link) {
        this.data = data;
        link = link;
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

    public ListNode getLink() {
        return link;
    }

    public void setLink(ListNode link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return data + "--> ";
    }
}
