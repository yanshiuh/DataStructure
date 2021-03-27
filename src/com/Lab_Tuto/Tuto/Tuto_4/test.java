package com.Lab_Tuto.Tuto.Tuto_4;

public class test {

    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        Node<String> node1 = new Node<>("a");
        Node<String> node2 = new Node<>("z");

        node1.next = node2;
        node1.getNext();

        Node<String> firstNode = new Node<>("First");
        linkedList.addFirst(node2.element);
        linkedList.addFirst(node1.element);
        linkedList.addFirst(firstNode.element);
    }
}
