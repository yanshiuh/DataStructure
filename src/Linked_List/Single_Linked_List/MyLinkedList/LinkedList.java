package Linked_List.Single_Linked_List.MyLinkedList;

import Linked_List.Double_Linked_List.DoubleListNode;

public class LinkedList<T extends Comparable<T>> {
    private ListNode head;

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

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void showList() {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }

    // insert data from back
    public void addNode(T data) {
        ListNode newNode = new ListNode(data, null);
        ListNode currentNode = head;
        if (currentNode == null)
            currentNode = newNode;
        else {
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            currentNode.setLink(newNode);
        }
    }

    // delete from back
    public void deleteNode() {
        ListNode previousNode = head;
        ListNode currentNode = head;
        if (head != null) {
            if (currentNode.getLink() != null) {
                while (currentNode.getLink() != null) {
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
            } else
                currentNode = null;
        } else
            System.out.println("List is empty");
    }

    public void addFrontNode(T data) {
        head = new ListNode(data, head);
    }

    public void deleteFrontNode() {
        if (head != null)
            head = head.getLink();
        else
            System.out.println("List is empty");
    }

    public boolean contains(T data) {
        boolean found = false;
        ListNode currentNode = head;
        while (currentNode != null) {
            if (data.compareTo((T) currentNode.getLink()) == 0) {
                found = true;
                break;
            }
            currentNode = currentNode.getLink();
        }
        return found;
    }

    public void setFrontNode(T data) {
        if (head != null)
            head.setData(data);
        else
            System.out.println("Invalid update");
    }

    public void setBackNode(T data) {
        ListNode currentNode = head;
        if (head == null)
            System.out.println("Invalid update");
        else {
            if (currentNode.getLink() == null)
                currentNode.setData(data);
            else {
                while (currentNode.getLink() != null)
                    currentNode = currentNode.getLink();
                currentNode.setData(data);
            }
        }
    }

    public void setNode(T data, int index) {
        if (index == 0)
            setFrontNode(data);
        else if (index == length() - 1)
            setBackNode(data);
        else if (index >= length())
            System.out.println("Invalid update");
        else {
            ListNode currentNode = head;
            for (int i = 0; i <= index; i++) {
                currentNode = currentNode.getLink();
            }
            currentNode.setData(data);
        }
    }

    public T getFront() {
        if (head != null)
            return (T) head.getData();
        else {
            System.out.println("The list is empty");
            return null;
        }
    }

    public T getBack() {
        if (head != null) {
            ListNode currentNode = head;
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();
        } else
            return null;
    }

    public T get(int index) {
        if (index == 0)
            return getFront();
        else if (index == length() - 1)
            return getBack();
        else if (index >= length()) {
            System.out.println("Invalid operation");
            return null;
        }
        else {
            ListNode currentNode = head;
            for (int i = 0; i <= index; i++)
                currentNode = currentNode.getLink();
            return (T) currentNode.getData();
        }
    }
}
