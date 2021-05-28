package com.Lab_Tuto.Tuto.Tuto_9;

public class test {

    public static void main(String[] args) {
        System.out.println(reverseString("String"));
        System.out.println(sum(5));
        printDigit(4567);
    }

    public static String reverseString(String s) {
        if (s.length() == 1)
            return s;
        else
            return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
    }

    public static int sum(int n) {
        if (n == 1)
            return n;
        else {
            return n + sum(n - 1);
        }
    }

    public static void printDigit(int number) {
        if (number < 10)
            System.out.print(number + " ");
        else {
            printDigit(number / 10);
            System.out.print(number % 10 + " ");
        }
    }
}
