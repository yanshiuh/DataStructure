package com.Lab_Tuto.Lab_from_snr.Lab_4.Q1;

public class LinkedList<T extends Comparable<T>> {
    private ListNode<T> head;
    private int count = 0;

    public LinkedList() {
        head = null;
    }

    public int length() {
        int count = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getLink();
            count++;
        }

        return count;
    }

    public T getFront() {
        return head.getData();
    }

    public T getBack() {
        if (head.getLink() == null)
            return head.getData();
        else {
            ListNode currentNode = head;
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();
        }
    }

    public T get(int index) {
        if (index == 0)
            return getFront();
        else if (index == length() - 1)
            return getBack();
        else if (index >= length())
            return null;
        else {
            ListNode<T> currentNode = head;
            for (int i = 1; i <= index; i++)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();
        }
    }

    public void setFront(T data) {
        if (head != null)
            head.setData(data);
        else
            System.out.println("The list is empty");
    }

    public void setBack(T data) {
        if (head == null)
            System.out.println("The list is empty");
        else {
            ListNode<T> currentNode = head;
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            currentNode.setData(data);
        }
    }

    public void set(T data, int index) {
        if (index == 0)
            setFront(data);
        else if (index == length() - 1)
            setBack(data);
        else if (index >= length())
            System.out.println("Invalid index");
        else {
            ListNode<T> currentNode = head;
            for (int i = 0; i < index; i++)
                currentNode = currentNode.getLink();
            currentNode.setData(data);
        }

    }

    public void insertBack(T data) {
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

    public void insertFront(T data) {
        head = new ListNode<>(data, head);
    }

    public void addSortNode(T data) {
        if (count <= length()) {
            insertBack(data);
            count++;
            if (count == length()) {
                for (int pass = 1; pass < length(); pass++) {
                    for (int i = 0; i < length() - 1; i++) {
                        if (get(i + 1).compareTo(get(i)) < 0) {
                            T temp = get(i + 1);
                            set(get(i), i + 1);
                            set(temp, i);
                        }
                    }
                }
            }
        }
    }

    public void showList() {
        if (head != null) {
            ListNode<T> currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
        }
        else
            System.out.println("The list is empty");
    }
}
