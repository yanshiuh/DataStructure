package com.Lab_Tuto.Lab_from_snr.Lab_2;

import java.util.Random;

public class Q1Tester {

    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("Generate 20 non-duplicate integer within 0-100");
        Linked_List_Form<Integer> a = new Linked_List_Form<>(20);
        int x = 0;
        while (x != 20) {
            int num = r.nextInt(101);
            if (!a.isRepeat(num)) {
                a.insert(num);
                x++;
            }
            //else continue;
        }
        System.out.println(a.toString());

        Array_List_form<Integer> b = new Array_List_form<>(20);
        int i = 0;
        while (i != 20) {
            int num = r.nextInt(101);
            if (!b.isRepeat(num)) {
                b.insert(num);
                i++;
            }
        }
        System.out.println(b.toString());
    }
}
