package Linked_List.Single_Linked_List.Practise;

import java.util.LinkedList;

public class g_remove_element {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        linkedList.remove((Object) 1);
        linkedList.removeLast();

        System.out.println(linkedList.pop());   // remove first element and return the element

        System.out.println(linkedList);
    }
}
