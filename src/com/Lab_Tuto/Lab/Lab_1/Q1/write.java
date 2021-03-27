package com.Lab_Tuto.Lab.Lab_1.Q1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class write {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("YanShiuh_U2005308.txt"))){
            writer.print("Thursday, 18 June 2021.\n");
            System.out.println("Enter a text:");
            String line = sc.nextLine();
            writer.println(line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
