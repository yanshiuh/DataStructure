package Linked_List.Single_Linked_List.Practise;

import java.util.LinkedList;

public class f_get_element_from_list {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        Object first = linkedList.getFirst();
        System.out.println(first);

        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
    }
}
