package Linked_List.Single_Linked_List.Example;

import java.util.LinkedList;

public class Iterate_and_Print_each_element {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        for (Object e : linkedList) {     // foreach loop
            System.out.print(e + " ");
        }
        System.out.println();

        linkedList.forEach(e -> System.out.print(e + " "));  // forEach method / lambda expression
    }
}
