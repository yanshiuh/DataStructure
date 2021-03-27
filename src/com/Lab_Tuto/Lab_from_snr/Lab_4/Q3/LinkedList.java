package com.Lab_Tuto.Lab_from_snr.Lab_4.Q3;

public class LinkedList<T extends Comparable<T>> {
    private ListNode<T> head;

    public LinkedList() {
        head = null;
    }

    public int length() {
        ListNode<T> currentNode = head;
        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }

        return count;
    }

    public void insert(Course course) {
        ListNode<T> newNode = new ListNode(course, null);
        if (head == null)
            head = newNode;
        else {
            ListNode<T> currentNode = head;
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            currentNode.setLink(newNode);
        }
    }

    public void showList() {
        ListNode<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }

}
