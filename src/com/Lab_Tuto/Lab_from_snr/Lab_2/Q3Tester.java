package com.Lab_Tuto.Lab_from_snr.Lab_2;

public class Q3Tester {

    public static void main(String[] args) {
        Array_List_UNO a = new Array_List_UNO("Player 1");
        System.out.println(a.toString());
        Array_List_UNO b = new Array_List_UNO("Player 2");
        System.out.println(b.toString());

        System.out.println();

        Linked_List_UNO c = new Linked_List_UNO("Player 1");
        System.out.println(c.toString());
        Linked_List_UNO d = new Linked_List_UNO("Player 2");
        System.out.println(d.toString());
    }
}
