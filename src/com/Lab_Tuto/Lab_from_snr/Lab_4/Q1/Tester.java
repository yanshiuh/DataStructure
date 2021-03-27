package com.Lab_Tuto.Lab_from_snr.Lab_4.Q1;

import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        Random r = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = r.nextInt(101);

        System.out.print("The random numbers are : ");
        for (int num: numbers)
            System.out.print(num + " ");

        System.out.println();
        LinkedList<Integer> back = new LinkedList<>();
        LinkedList<Integer> front = new LinkedList<>();
        LinkedList<Integer> sort = new LinkedList<>();
        for (int i = 0; i < numbers.length; i++) {
            back.insertBack(numbers[i]);
            front.insertFront(numbers[i]);
            sort.addSortNode(numbers[i]);
        }

        System.out.println("\nInsert the random numbers at the back of the linked list");
        back.showList();

        System.out.println("\n\nInsert the random numbers at the front of the linked list");
        front.showList();

        System.out.println("\n\nInsert the random numbers in a sorted linked list");
        sort.showList();
    }
}
