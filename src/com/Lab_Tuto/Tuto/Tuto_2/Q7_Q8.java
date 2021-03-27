package com.Lab_Tuto.Tuto.Tuto_2;

import java.util.ArrayList;

public class Q7_Q8 {

    public static void main(String[] args) {
        // Q7
        ArrayList<String> vehicle = new ArrayList<>();
        ArrayList<Object> transportation = new ArrayList<>();

        // Q8
        ArrayList<Integer> numOfCars = new ArrayList<>();
        ArrayList<Double> milesPerHour = new ArrayList<>();
    }

    public static <E> void allTransportation(ArrayList<E> a, ArrayList<? super E> b) {

    }

    public static <E> void display(ArrayList<?> arrayList) {
        for (int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");
        System.out.println();
    }
}
