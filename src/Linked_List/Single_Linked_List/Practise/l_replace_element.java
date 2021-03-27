package Linked_List.Single_Linked_List.Practise;

import org.w3c.dom.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class l_replace_element {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        linkedList.set(2,"KD Nets");    // replace
        System.out.println(linkedList);

    }
}
