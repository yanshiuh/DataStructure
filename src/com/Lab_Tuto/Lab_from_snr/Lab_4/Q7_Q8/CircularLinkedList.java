package com.Lab_Tuto.Lab_from_snr.Lab_4.Q7_Q8;

public class CircularLinkedList<T extends Comparable<T>> {
    private ListNode<T> head;

    public CircularLinkedList() {
        head = null;
    }

    public int length() {
        int count = 0;
        ListNode<T> currentNode = head;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    public void addCircularNode(T data) {
        ListNode<T> newNode = new ListNode<>(data, null);
        ListNode<T> currentNode = head;
        if (head == null)
            head = newNode;
        else {
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            currentNode.setLink(newNode);
        }
    }

    public void deleteCircularNode() {
        ListNode<T> currentNode = head;
        ListNode<T> previousNode = head;
        if (head != null) {
            if (head.getLink() == null)
                head = null;
            else {
                while (currentNode.getLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }
        }
        else System.out.println("The list is empty");
    }

    public void showList() {
        ListNode<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
        System.out.print(head.toString());
    }

    public T getFront() {
        return head.getData();
    }

    public T getBack() {
        ListNode<T> currentNode = head;
        while (currentNode.getLink() != null)
            currentNode = currentNode.getLink();
        return currentNode.getData();
    }

    public T getCircularItem(int index) {
        if (index == 0)
            return getFront();
        else if (index == length() - 1)
            return getBack();
        else if (index >= length())
            return null;
        else {
            ListNode<T> currentNode = head;
            for (int i = 1; i <= index ; i++)
                currentNode = currentNode.getLink();

            return currentNode.getData();
        }
    }
}
