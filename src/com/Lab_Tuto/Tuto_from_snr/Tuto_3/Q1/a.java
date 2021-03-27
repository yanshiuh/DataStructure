package com.Lab_Tuto.Tuto_from_snr.Tuto_3.Q1;

public class a {

    public static void main(String[] args) {
        int[] nums = {3, 4, -2, 7, 0};
        //System.out.println(findSmallest(nums));
        System.out.println(fins_Smallest(nums, nums.length));
    }

    public static int fins_Smallest(int[] numbers, int numberOfElements) {
        // assume number[0] is the smallest
        if (numberOfElements == 1)
            return numbers[0];
        else {
            if (numbers[numberOfElements - 1] < numbers[0])
                numbers[0] = numbers[numberOfElements - 1];
            return fins_Smallest(numbers, numberOfElements - 1);
        }
    }

//    public static int smallest(int[] numbers, int index, int min) {
//        if (index + 1 == numbers.length)
//            return min;
//        else {
//            index++;
//            if (min > numbers[index])
//                min = numbers[index];
//            return smallest(numbers, index, min);
//        }
//    }
//
//    public static int findSmallest(int[] numbers) {
//        return smallest(numbers, 0, numbers[0]);
//    }
}
