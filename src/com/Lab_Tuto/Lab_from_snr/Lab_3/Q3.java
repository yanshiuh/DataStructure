package com.Lab_Tuto.Lab_from_snr.Lab_3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        String[] numbers = new String[n];
        System.out.print("The elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.toString(r.nextInt(10));
            System.out.print(numbers[i]);
        }

        System.out.println(Arrays.toString(swap(numbers, 0)));
    }

    public static void recursion() {

    }

    public static String[] swap(String[] numbers, int index_char) {
        String[] temps = numbers;
        String[] nums = new String[temps.length];
        for (int i = 1; i < temps.length; i++) {
            temps = numbers;
            String swap_element = temps[index_char];
            if (!swap_element.equals(temps[i])) {
                String temp = temps[i];
                temps[i] = swap_element;
                temps[index_char] = temp;

                String num = "";
                for (String n: temps)
                    num += n;

                nums[i] = num;
            }
        }
        return nums;
    }

    public static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return  num * factorial(num - 1);
    }
}
