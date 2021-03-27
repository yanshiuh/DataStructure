package com.Lab_Tuto.Tuto_from_snr.Tuto_4.Q3_Q4_Q5_Q6;

import java.util.Random;

public class LinkedList<T extends Comparable<T>> {
    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public void insert(T data) {
        ListNode<T> newNode = new ListNode<T>(data, null);
        ListNode currentNode = head;
        if (head == null)
            head = newNode;
        else {
            while (currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }

    public void showCombineList(LinkedList other) {
        if (head != null) {
            ListNode currentNode = head;
            int i = 0;
            while (currentNode != null) {
                System.out.println(currentNode.toString() + other.get(i));
                currentNode = currentNode.getLink();
                i++;
            }
        } else
            System.out.println("The list is empty");
    }

    public void showList() {
        if (head == null)
            System.out.println("The list is empty");
        else {
            ListNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.toString_1());
                currentNode = currentNode.getLink();
            }
        }
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
        if (head != null)
            return (T) head.getData();
        else
            return null;
    }

    public T getBack() {
        if (head != null) {
            ListNode currentNode = head;
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();
        }
        else
            return null;
    }

    public T get(int index) {
        if (index == 0)
            return getFront();
        else if (index == length() - 1)
            return getBack();
        else if (index >= length())
            return null;
        else {
            ListNode currentNode = head;
            for (int i = 0; i < index; i++)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();
        }
    }

    // -------------------------------------------------------------------------
    // Q4
    public int sum() {
        ListNode currentNode = head;
        int sum = 0;
        while (currentNode != null) {
            sum += (Integer) currentNode.getData();
            currentNode = currentNode.getLink();
        }
        return sum;
    }

    public int countEven() {
        ListNode currentNode = head;
        int count = 0;
        while (currentNode != null) {
            if ((Integer) currentNode.getData() % 2 == 0)
                count++;
            currentNode = currentNode.getLink();
        }

        return count;
    }

    // -------------------------------------------------------------------------------
    // q5
    public void generateAndInsert() {
        Random r = new Random();
        T data = (T) (Integer) r.nextInt(10);

        ListNode<T> newNode = new ListNode<T>(data, null);
        ListNode currentNode = head;
        if (head == null)
            head = newNode;
        else {
            while (currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }

    public void deleteSpecifiedValue(T data) {
        ListNode currentNode = head;
        if (head.getData() == data) {
            head = head.getLink();
        } else {
            while (currentNode.getLink() != null) {
                if (currentNode.getLink().getData() == data) {
                    ListNode tempNode = currentNode.getLink();
                    currentNode.setLink(tempNode.getLink());
                    tempNode = null;
                }
                currentNode = currentNode.getLink();
                if (currentNode == null) break;
            }
        }
    }

    // -------------------------------------------------------------------------
    // q6
    public void addFront(T data) {
        head = new ListNode<>(data, head);
    }

    public T median() {
        if (length() % 2 == 0)
            return null;
        else
            return get(((length() - 1) / 2));
    }
}
