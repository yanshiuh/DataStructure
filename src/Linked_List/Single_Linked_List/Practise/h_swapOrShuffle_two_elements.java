package Linked_List.Single_Linked_List.Practise;

import java.util.Collections;
import java.util.LinkedList;

public class h_swapOrShuffle_two_elements {

    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(7);
        linkedList.add("KD");
        linkedList.add(35);
        linkedList.add("harden");

        Collections.swap(linkedList,0, linkedList.size() - 1);   // swap 2 elements
        System.out.println(linkedList);

        Collections.shuffle(linkedList);    // shuffle
        System.out.println(linkedList);


    }
}
