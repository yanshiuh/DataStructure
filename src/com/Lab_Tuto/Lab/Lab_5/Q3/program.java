package com.Lab_Tuto.Lab.Lab_5.Q3;

public class program {

    public static void main(String[] args) {
        doublyLinkedList<Integer> list = new doublyLinkedList<>();
        list.addFirst(1);
        list.addLast(10);
        list.addLast(100);
        list.add(2, 2);
        //list.remove(3);

        System.out.println();
        list.iterateForward();
        System.out.println();
        list.iterateBackward();

        System.out.println("\nSize of current Doubly Linked List: " + list.getSize());
        list.clear();
        System.out.println("\nSize of current Doubly Linked List: " + list.getSize());
    }
}
