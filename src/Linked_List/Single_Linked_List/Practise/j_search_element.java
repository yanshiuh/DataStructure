package Linked_List.Single_Linked_List.Practise;

import java.util.LinkedList;

public class j_search_element {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        boolean check = linkedList.contains("KD");
        if (check)
            System.out.println("Exist");
    }
}
