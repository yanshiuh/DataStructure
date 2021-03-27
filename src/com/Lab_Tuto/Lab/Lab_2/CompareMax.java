package com.Lab_Tuto.Lab.Lab_2;

public class CompareMax {

    public static <E extends Comparable<E>> E maximum(E o1, E o2, E o3) {
        E max = o1;
        if (max.compareTo(o2) < 0)
            max = o2;
        if (max.compareTo(o3) < 0)
            max = o3;

        return max;
    }

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        System.out.println(maximum(a, b, c));
    }
}
