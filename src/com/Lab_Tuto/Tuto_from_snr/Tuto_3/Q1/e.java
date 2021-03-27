package com.Lab_Tuto.Tuto_from_snr.Tuto_3.Q1;

public class e {

    public static void main(String[] args) {
        System.out.println(sumOfCubes(5));
    }

    public static int sumOfCubes(int num) {
        int sum;
        if (num == 1)
            return 1;
        else {
            sum = (int) Math.pow(num, 3);
            return sum + sumOfCubes(num - 1);
        }
    }
}
