package com.Lab_Tuto.Lab_from_snr.Lab_4.Q6;

import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> q6 = new DoubleLinkedList<>();
        Random r = new Random();
        System.out.print("The random numbers are : ");
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(101);
            System.out.print(num + " ");
            q6.insertRight(num);
        }

        System.out.println("\nThe original list");
        q6.showList();

        System.out.println("\nRemove a number from 3rd position");
        q6.delete(3);
        q6.showList();

        System.out.println("\nReplace the number in 7th position with 999");
        q6.set(999, 7);
        q6.showList();

        System.out.println("\nRemove all even number from the list");
        q6.removeEven();
        //q6.showList();

    }
}
