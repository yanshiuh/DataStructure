package Linked_List.Single_Linked_List.Practise;

import java.util.Iterator;
import java.util.LinkedList;

public class c_reverse {

    public static void main(String[] args) {
        // Write a Java program to iterate a linked list in reverse order
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        Iterator reverse = linkedList.descendingIterator();

        while (reverse.hasNext())
            System.out.print(reverse.next() + " ");
    }
}
