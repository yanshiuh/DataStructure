package Linked_List.Single_Linked_List.Practise;

import java.util.LinkedList;

public class i_clone_list {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        LinkedList<Object> copyList = new LinkedList<Object>();
        copyList = (LinkedList) linkedList.clone();
        System.out.println(copyList);
    }
}
