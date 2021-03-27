package Linked_List.Single_Linked_List.Practise;

import java.util.LinkedList;

public class e_add_elements_or_newList {

    public static void main(String[] args) {
        // Write a Java program to insert some elements at the specified position into a linked list
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        LinkedList<Object> newList = new LinkedList<>();
        newList.add(24);
        newList.add("Kobe");

        linkedList.addAll(1, newList);

        System.out.println(linkedList);
    }
}
