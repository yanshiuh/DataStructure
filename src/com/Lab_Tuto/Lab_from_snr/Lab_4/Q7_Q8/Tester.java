package com.Lab_Tuto.Lab_from_snr.Lab_4.Q7_Q8;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        CircularLinkedList<String> q7 = new CircularLinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++)
            q7.addCircularNode(words[i]);

        System.out.println("\nThe words in the circular linked list");
        q7.showList();

        System.out.println("\nAfter delete a word");
        q7.deleteCircularNode();
        q7.showList();

        System.out.println("\nThe second item in the list is " + q7.getCircularItem(1));
    }
}
