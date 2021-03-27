package com.Lab_Tuto.Tuto_from_snr.Tuto_4.Q1_Q2;

public class ListNode<Number> {
    private Number data;
    private ListNode<Number> link;

    public ListNode() {
        data = null;
        link = null;
    }

    public ListNode(Number data, ListNode<Number> link) {
        this.data = data;
        this.link = link;
    }

    public Number getData() {
        return data;
    }

    public void setData(Number data) {
        this.data = data;
    }

    public ListNode<Number> getLink() {
        return link;
    }

    public void setLink(ListNode<Number> link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return data + " --> ";
    }
}
