package Recursion.Recursive_Method_with_Return_Value;

import java.util.Arrays;

public class Example_3_binarySearch {
    public static void main(String[] args) {
        int[] list = {7, 35, 1, 3, 24, 77, 13};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.println(binarySearch(list, 0, list.length - 1, 78));
    }

    public static int binarySearch(int[] list, int first, int last, int key) {
        int mid, index;
        if (first > last)            // base case
            return -1;
        else {
            mid = (first + last) / 2;
            if (key == list[mid])
                index = mid;
            else if (key < list[mid])
                return binarySearch(list, first, mid - 1, key);
            else
                return binarySearch(list, mid + 1, last, key);
            return index;
        }
    }
}
