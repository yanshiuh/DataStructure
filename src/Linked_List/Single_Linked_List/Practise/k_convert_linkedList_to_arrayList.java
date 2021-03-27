package Linked_List.Single_Linked_List.Practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class k_convert_linkedList_to_arrayList {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        System.out.println(linkedList);
        List<Object> arraylist = new ArrayList<>(linkedList);
        System.out.println(arraylist);
    }
}
