package com.Lab_Tuto.Tuto_from_snr.Tuto_3.Q1;

public class b {

    public static void main(String[] args) {
        int[] numbers = {13, 35, 7, 24, 1};
        System.out.println(sum(numbers, numbers.length));
    }

    public static int sum(int[] numbers, int number_of_elements) {
        if (number_of_elements == 1)
            return numbers[0];
        else {
            numbers[0] += numbers[number_of_elements - 1];
            return sum(numbers, number_of_elements - 1);
        }
    }
}
