package Linked_List.Single_Linked_List.Practise;

import java.util.Iterator;
import java.util.LinkedList;

public class b_print_at_specified_position {

    public static void main(String[] args) {
        // Write a Java program to iterate through all elements in a linked list starting at the specified position
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        int index = 2;
        Iterator<Object> iterator = linkedList.listIterator(index);

        // print from third position
        System.out.println("Start from position " + index + ": ");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
    }
}
