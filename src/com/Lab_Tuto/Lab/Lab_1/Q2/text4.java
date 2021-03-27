package com.Lab_Tuto.Lab.Lab_1.Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileInputStream("text4.txt"))) {
            String a = "";
            String letter = "";
            while (sc.hasNextLine()) {
                a = sc.next();
            }
            for (int i = 0; i < a.length(); i++) {
                if (Character.isLetter(a.charAt(i))) {
                    letter += a.charAt(i);
                }
            }
            System.out.println(letter);
            System.out.println(letter.length());
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}
