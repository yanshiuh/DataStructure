package com.Lab_Tuto.Lab.Lab_2.Q1;

public class Tester {

    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(c.compareTo(a));

        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
        System.out.println(c.equals(a));
    }
}
