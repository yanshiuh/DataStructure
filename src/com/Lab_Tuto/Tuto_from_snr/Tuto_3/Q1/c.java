package com.Lab_Tuto.Tuto_from_snr.Tuto_3.Q1;

public class c {

    public static void main(String[] args) {
        System.out.println(GCD(392, 280));
    }

    public static int GCD(int x, int y) {
        if (y == 0)
            return x;
        else {
            int temp = x;
            x = y;
            y = temp % y;
            return GCD(x, y);
        }
    }
}
