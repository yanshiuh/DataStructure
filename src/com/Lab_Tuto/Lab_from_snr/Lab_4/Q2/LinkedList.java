package com.Lab_Tuto.Lab_from_snr.Lab_4.Q2;

public class LinkedList<T extends Comparable<T>> {
    private ListNode<T> head;
//    private LinkedList<T> firstList;
//    private LinkedList<T> secondList;

    public LinkedList() {
        head = null;
//        firstList = new LinkedList<>();
//        secondList = new LinkedList<>();
    }

    public int length() {
        int count = 0;
        if (head == null)
            System.out.println("The list is empty");
        else {
            ListNode<T> currentNode = head;
            while (currentNode != null) {
                count++;
                currentNode = currentNode.getLink();
            }
        }
        return count;
    }

    public void insert(T data) {
        ListNode<T> newNode = new ListNode<>(data, null);
        if (head == null)
            head = newNode;
        else {
            ListNode<T> currentNode = head;
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            currentNode.setLink(newNode);
        }
    }

    public T getFront() {
        return head.getData();
    }

    public T getBack() {
        ListNode<T> currentNode = head;
        while (currentNode.getLink() != null) {
            currentNode = currentNode.getLink();
        }
        return (T) currentNode.getData();
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
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getLink();
            }
            return (T) currentNode.getData();
        }
    }

    public void showList() {
        ListNode<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }

    public void splitList() {
        LinkedList<T> firstList = new LinkedList<>();
        LinkedList<T> secondList = new LinkedList<>();
        if (length() % 2 == 0) {
            int half = length() / 2;
            for (int i = 0; i < half; i++) {
                firstList.insert(get(i));
                secondList.insert(get(i + half));
            }
        } else {
            int half = length() / 2;  // *7 / 2 = 3
            for (int i = 0; i <= half; i++) {
                firstList.insert(get(i));
            }
            for (int i = 0; i < half; i++) {
                secondList.insert(get(i + half + 1));
            }
        }
        System.out.print("First List : ");
        firstList.showList();

        System.out.print("\nSecond List : ");
        secondList.showList();
    }

    public void alternateList() {
        LinkedList<T> firstList = new LinkedList<>();
        LinkedList<T> secondList = new LinkedList<>();
        for (int i = 0; i < length(); i++) {
            if (i % 2 == 0)
                firstList.insert(get(i));
            else
                secondList.insert(get(i));
        }
        System.out.print("First List : ");
        firstList.showList();

        System.out.print("\nSecond List : ");
        secondList.showList();
    }

    public void mergeList() {
        LinkedList<T> firstList =  new LinkedList<>();
        LinkedList<T> secondList = new LinkedList<>();

        LinkedList<T> merge = new LinkedList<>();
        for (int i = 0; i < firstList.length(); i++) {
            merge.insert(firstList.get(i));
            if (i < secondList.length())
                merge.insert(secondList.get(i));
        }

        merge.showList();
    }

    public void reverseList(int index) {
        if (index == 0)
            System.out.print(head.toString());
        else {
            System.out.print(get(index) + "--> ");
            reverseList(index - 1);
        }
    }
}
