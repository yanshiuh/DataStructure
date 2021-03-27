package com.Lab_Tuto.Lab_from_snr.Lab_4.Q2;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        LinkedList<Character> q2 = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            q2.insert(word.charAt(i));
        }
        System.out.print("The original list : ");
        q2.showList();

        System.out.println("\nSplit the list into two");
        q2.splitList();

        System.out.println("\nSplit the list by alternating the nodes");
        q2.alternateList();

        System.out.println("\nMerge First and Second List by alternating the nodes");
        q2.mergeList();

        System.out.println("\nReverse the list in linked list");
        q2.reverseList(q2.length() - 1);

        System.out.println("\nReverse the list in tester class");
        reverse(q2, q2.length() - 1);
    }

    public static void reverse(LinkedList<Character> list, int index) {
        if (index == 0)
            System.out.print(list.get(index) + "--> ");
        else {
            System.out.print(list.get(index) + "--> ");
            reverse(list, index - 1);
        }
    }
}
