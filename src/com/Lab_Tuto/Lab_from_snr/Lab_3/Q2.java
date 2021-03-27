package com.Lab_Tuto.Lab_from_snr.Lab_3;

import java.io.*;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        String text = "";
        try (Scanner read = new Scanner(new FileInputStream("TextFile.txt"))) {
            while (read.hasNextLine()) {
                text += read.nextLine();
                //System.out.println(text);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        try (PrintWriter write = new PrintWriter(new FileOutputStream("Reverse.txt"))) {
            write.println(reverseString(text));
        } catch (IOException e) {
            System.out.println("Invalid output file");
        }
    }

    public static String reverseString(String text) {
        String reverse;
        if (text.length() == 1)
            return text;
        else {
            reverse = text.charAt(text.length() - 1) + "";
            return reverse + reverseString(text.substring(0, text.length() - 1));
        }
    }
}
