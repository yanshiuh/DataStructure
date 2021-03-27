package com.Lab_Tuto.Lab_from_snr.Lab_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        int index = 0;
        try {
            while (true) {
                System.out.print("Enter an integer: ");
                int num;
                try {
                    num = sc.nextInt();
                    numbers[index] = num;
                    index++;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input type");
                    sc.nextLine();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array of integers is: ");
            for (int num: numbers)
                System.out.print(num + " ");
        }
    }
}
