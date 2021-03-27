package com.Lab_Tuto.Tuto_from_snr.Tuto_4.Q1_Q2;

public class LinkedList<Number extends Comparable<Number>> {
    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public void showList() {
        System.out.println("The elements in the linked list");
        ListNode<Number> currentNode = head;
        if (head == null)
            System.out.println("The list is empty");
        else {
            while (currentNode != null) {
                System.out.print(currentNode.toString());
                currentNode = currentNode.getLink();
            }
        }
    }

    public void insert(Number data) {
        ListNode<Number> newNode = new ListNode<Number>(data, null);
        ListNode<Number> currentNode = head;
        if (head == null)
            head = newNode;
        else {
            while (currentNode.getLink() != null)
                currentNode = currentNode.getLink();
            currentNode.setLink(newNode);
        }
    }

    //Q2
    public void addValue() {
        ListNode<Number> currentNode = head;
        if (head == null)
            System.out.println("The list is empty");
        else {
            while (currentNode != null) {
                Double data = 0.0;
                if ((Double) currentNode.getData() > 20.0) {
                    data = (Double) currentNode.getData() + 10.5;
                    currentNode.setData((Number) data);
                }
                currentNode = currentNode.getLink();
            }
        }
    }

}
