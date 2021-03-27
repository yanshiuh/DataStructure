package Linked_List.Single_Linked_List.Example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayAndLinkedList {

    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(1);  // 1 is autoboxed to new Integer(1)
        arraylist.add(3);
        arraylist.add(35);
        arraylist.add(1);
        arraylist.add(0,7);  // add 7 at the first position(0)
        arraylist.add(2,13);

        System.out.print("A list of integers in array list: ");
        System.out.println(arraylist);

        LinkedList<Object> linkedList = new LinkedList<>(arraylist);
        linkedList.add(24);
        linkedList.addFirst("Kevin Durant");  // can add any type of data as we declare Object
        linkedList.addLast(23);
        linkedList.add(5,"Harden");
        System.out.println("\nA list of objects in linked list: " + linkedList);

        System.out.print("\nDisplay the list forward: ");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();

        System.out.print("\nDisplay the list backward: ");
        listIterator = linkedList.listIterator(linkedList.size());  // must give size of list to display reverse
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
