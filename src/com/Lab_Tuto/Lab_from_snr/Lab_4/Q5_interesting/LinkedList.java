package com.Lab_Tuto.Lab_from_snr.Lab_4.Q5_interesting;

import java.util.Iterator;

public class LinkedList<T extends Comparable<T>> {
    private ListNode<T> head;

    public LinkedList() {
        head = null;
    }

    class LinkedListIterator {
        Iterator<Object> iterator = new Iterator<Object>() {
            ListNode<T> currentNode = head;
            ListNode<T> previousNode = head;
            @Override
            public boolean hasNext() {
                if (head == null)
                    return false;
                else {
                    if (currentNode.getLink() != null) {
                        previousNode = currentNode;
                        currentNode = currentNode.getLink();
                        return true;
                    }
                    else
                        return false;
                }
            }

            @Override
            public Object next() {
                String element = (String) previousNode.getData();
                for (int i = 0; i < element.length(); i++) {
                    if (element.charAt(i) == 'A') {
                        return (T) previousNode.getData();
                    }
                }
                return null;
            }
        } ;

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

    public void showList() {
        ListNode<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }

    public int length() {
        int count = 0;
        ListNode<T> currentNode = head;
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
        ListNode<T> currentNode = head;
        while (currentNode.getLink() != null)
            currentNode = currentNode.getLink();
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
            for (int i = 1; i <= index; i++)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();
        }
    }

    public void removeFront() {
        if (head != null)
            head = head.getLink();
        else
            System.out.println("The list is empty");
    }

    public void removeBack() {
        ListNode<T> previousNode = head;
        ListNode<T> currentNode = head;
        if (head != null) {
            if (currentNode.getLink() == null)
                head = null;
            else {
                while (currentNode.getLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
                previousNode.setLink(null);
            }
        } else
            System.out.println("The list is empty");
    }

    public void remove(int index) {
        if (index == 0)
            removeFront();
        else if (index == length() - 1)
            removeBack();
        else if (index >= length())
            System.out.println("Invalid index");
        else {
            ListNode<T> currentNode = head;
            for (int i = 1; i < index; i++) {
                currentNode = currentNode.getLink();
            }
            ListNode<T> tempNode = currentNode.getLink();
            currentNode.setLink(tempNode.getLink());
            tempNode = null;
        }
    }

    public void delete(T data) {   // delete specified element without index
        for (int i = 0; i < length(); i++)
            if (get(i).compareTo(data) == 0)
                remove(i);
    }
}
