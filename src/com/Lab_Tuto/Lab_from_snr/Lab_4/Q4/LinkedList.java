package com.Lab_Tuto.Lab_from_snr.Lab_4.Q4;

public class LinkedList<T extends Comparable<T>> {
    private ListNode<T> head;

    public LinkedList() {
        head = null;
    }

    public void insert(T data) {
        ListNode<T> newNode = new ListNode<>(data, null);
        if (head == null)
            head = newNode;
        else {
            ListNode<T> currentNode = head;
            while (currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }

    public void showList() {
        ListNode<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
}
