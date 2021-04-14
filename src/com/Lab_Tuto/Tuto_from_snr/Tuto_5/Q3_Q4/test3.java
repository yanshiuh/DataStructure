package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q3_Q4;

import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String string = sc.nextLine();

        Stack<Character> reverseSentence = new Stack<>();
        Stack<String> reverseWords = new Stack<>();

        // reverse sentence
        for (int i = 0; i < string.length(); i++)
            reverseSentence.push(string.charAt(i));
        reverseSentence.showStack();

        // reverse words
        String[] s = string.split(" ");
        for (int i = 0; i < s.length; i++)
            reverseWords.push(s[i] + " ");
        reverseWords.showStack();
    }
}
