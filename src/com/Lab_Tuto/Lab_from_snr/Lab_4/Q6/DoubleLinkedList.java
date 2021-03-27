package com.Lab_Tuto.Lab_from_snr.Lab_4.Q6;

public class DoubleLinkedList<T extends Comparable<T>> {
    private DoubleListNode<T> head;

    public DoubleLinkedList() {
        head = null;
    }

    public int length() {
        int count = 0;
        DoubleListNode<T> currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.getNextLink();
            count++;
        }
        return count;
    }

    public void insertLeft(T data) {
        DoubleListNode<T> currentNode = head;
        DoubleListNode<T> newNode = new DoubleListNode<>(data,null,null);
        if (head == null)
            head = newNode;
        else {
            head = newNode;
            if (currentNode.getNextLink() == null)
                currentNode.setLink(newNode, null);
            else {
                currentNode.setLink(newNode, currentNode.getNextLink());
            }
            newNode.setNextLink(currentNode);
        }
    }

    public void insertRight(T data) {
        DoubleListNode<T> currentNode = head;
        DoubleListNode<T> newNode = new DoubleListNode<>(data, null, null);
        if (head == null)
            head = newNode;
        else {
            while (currentNode.getNextLink() != null) {
                currentNode = currentNode.getNextLink();
            }
            currentNode.setNextLink(newNode);
            newNode.setPreviousLink(currentNode);
        }
    }

    public void insert(T data, int index) {
        if (index == 0)
            insertLeft(data);
        else if (index == length() - 1)
            insertRight(data);
        else if (index >= length())
            System.out.println("Invalid index");
        else {
            DoubleListNode<T> newNode = new DoubleListNode<>(data,null,null);
            DoubleListNode<T> currentNode = head;
            for (int i = 1; i < index; i++)
                currentNode = currentNode.getNextLink();

            DoubleListNode<T> tempNode = currentNode.getNextLink();
            currentNode.setNextLink(newNode);
            newNode.setLink(currentNode, tempNode);
            if (tempNode != null)
                tempNode.setPreviousLink(newNode);
        }
    }

    public void deleteLeft() {
        head = head.getNextLink();
        head.setPreviousLink(null);
    }

    public void deleteRight() {
        DoubleListNode<T> currentNode = head;
        DoubleListNode<T> previousNode = head;
        if (head != null) {
            if (head.getNextLink() == null)
                head = null;
            else {
                while (currentNode.getNextLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getNextLink();
                }
                currentNode = null;
                previousNode.setNextLink(null);
            }
        } else
            System.out.println("The list is empty");
    }

    public void delete(int index) {
        if (index == 0)
            deleteLeft();
        else if (index == length() - 1)
            deleteRight();
        else if (index >= length())
            System.out.println("Invalid index");
        else {
            DoubleListNode<T> currentNode = head;
            for (int i = 1; i < index; i++)
                currentNode = currentNode.getNextLink();

//            DoubleListNode<T> previousNode = currentNode.getPreviousLink();
//            previousNode.setNextLink(currentNode.getNextLink());
//            if (currentNode.getNextLink() != null)
//                currentNode.getNextLink().setPreviousLink(previousNode);
//            currentNode = null;

            DoubleListNode<T> tempNode = currentNode.getNextLink();
            currentNode.setNextLink(tempNode.getNextLink());
            if (tempNode.getNextLink() != null)
                tempNode.getNextLink().setPreviousLink(currentNode);
            tempNode = null;
        }
    }

    public void setFront(T data) {
        head.setData(data);
    }

    public void setBack(T data) {
        DoubleListNode<T> currentNode = head;
        while (currentNode.getNextLink() != null)
            currentNode = currentNode.getNextLink();
        currentNode.setData(data);
    }

    public void set(T data, int index) {
        if (index == 0)
            setFront(data);
        else if (index == length() - 1)
            setBack(data);
        else if (index >= length())
            System.out.println("Invalid index");
        else {
            DoubleListNode<T> currentNode = head;
            for (int i = 1; i < index; i++)
                currentNode = currentNode.getNextLink();

            currentNode.setData(data);
        }
    }

    public T getFront() {
        return head.getData();
    }

    public T getBack() {
        DoubleListNode<T> currentNode = head;
        while (currentNode.getNextLink() != null)
            currentNode = currentNode.getNextLink();
        return currentNode.getData();
    }

    public T get(int index) {
        if (index == 0)
            return getFront();
        else if (index == length() - 1)
            return getBack();
        else if (index >= length())
            return  null;
        else {
            DoubleListNode<T> currentNode = head;
            for (int i = 0; i < index; i++)
                currentNode = currentNode.getNextLink();

            return currentNode.getData();
        }
    }

    public void showList() {
        DoubleListNode<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.toString());
            currentNode = currentNode.getNextLink();
        }
    }

    public void removeEven() {
        for (int i = 0; i < length(); i++) {
//            System.out.print((Integer) get(i) % 2 + " ");
            if ((Integer) get(i) % 2 != 0) {
                System.out.print(" <-- " + get(i).toString() + " --> ");
            }
        }
    }
}
