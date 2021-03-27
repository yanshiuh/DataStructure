package com.Lab_Tuto.Tuto.Tuto_2;

public class Duo<A, B> {
    private A first;
    private B second;

    public Duo(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public static void main(String[] args) {
        Duo<String, Integer> sideShape = new Duo<>("Square", 4);
        Duo<Double, Double> points = new Duo<>(7.0, 35.0);
    }
}
