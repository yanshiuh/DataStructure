package com.Lab_Tuto.Lab_from_snr.Lab_5;

public class Q1 {

    public static void main(String[] args) {
        Stack<String> container = new Stack<>();
        container.push("Orange");
        container.push("Red");
        container.push("Blue");
        container.push("Orange");
        container.push("Yellow");
        container.push("Yellow");
        container.push("Blue");

        System.out.println("The candies in the container:");
        container.showStack();

        System.out.println("\nTakes the blue candies");
        container.remove("Blue");

        System.out.println("The candies in the container:");
        container.showStack();

    }
}
