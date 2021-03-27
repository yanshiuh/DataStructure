package com.Lab_Tuto.Lab.Lab_1.Q2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new FileInputStream("text1.txt"))){
            int num = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] items = line.split(",");
                num += items.length;

                for (int i = 0; i < items.length; i++) {
                    System.out.print(items[i]);
                }
                System.out.println();
            }
            System.out.println("Number of character: " + num);
        } catch (FileNotFoundException e) {
            System.out.println("no file found");
        }
    }
}
