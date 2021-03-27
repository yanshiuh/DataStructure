package com.Lab_Tuto.Tuto_from_snr.Tuto_3.Q4;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String a = sc.nextLine();
            if (a.length() > 12)
                throw new StringLengthException("The length of string cannot more than 12");
            else
                System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
