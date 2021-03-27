package com.Lab_Tuto.Lab.Lab_2;

public class Q4 {

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};

        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }

    public static <E extends Comparable<E>> String minmax(E[] list) {
        E min = list[0];
        E max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(min) < 0)
                min = list[i];

            if (list[i].compareTo(max) > 0)
                max = list[i];
        }

        return "Min = <" + min + "> Max = <" + max + ">";
    }
}
