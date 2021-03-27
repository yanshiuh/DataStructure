package Linked_List.Single_Linked_List.Practise;

import java.util.LinkedList;

public class d_insert_element_in_specified_position {

    public static void main(String[] args) {
        // Write a Java program to insert the specified element at the specified position in the linked list.
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        linkedList.add(2, "Kyrie Irving");
        linkedList.add(5, 11);
        linkedList.addFirst("No.1");
        linkedList.addLast("Last");
        linkedList.offerFirst("One");   // add element to front of LinkedList
        linkedList.offerLast("end");    // add element to last of LinkedList

        linkedList.forEach(e -> System.out.print(e + " "));

    }
}
