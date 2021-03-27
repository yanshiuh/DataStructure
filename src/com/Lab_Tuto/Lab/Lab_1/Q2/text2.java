package com.Lab_Tuto.Lab.Lab_1.Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileInputStream("text2.txt"))) {
            int count = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] items = line.split(", ");

                for (int i = 0; i < items.length; i++) {
                    for (int j = 0; j < items[i].length(); j++) {
                        System.out.print(items[i].charAt(j));
                        count++;
                    }
                }
                System.out.println();
            }
            System.out.println("Number of character: " + count);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}
