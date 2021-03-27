package Linked_List.Single_Linked_List.Practise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class a_iterate_through_linkedlist {

    public static void main(String[] args) {
        // Write a Java program to iterate through all elements in a linked list
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        for (Object e : linkedList) {   // 1st way
            System.out.print(e + " ");
        }
        System.out.println();

        linkedList.forEach(e -> System.out.print(e + " "));     // 2nd way

    }
}
