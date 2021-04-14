package com.Lab_Tuto.Lab.Lab_6.Q1_Q2;

import java.util.Scanner;

public class TestIntMyStack {

    public static void main(String[] args) {
        MyStack<Integer> a = new MyStack<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer value: ");
        int input = sc.nextInt();
        a.push(input);
        a.push(1);

        System.out.println(a);

        while (!a.isEmpty()) {
            System.out.println("[" + a.pop() + "]");
        }

        // The output is 1, 7.
        // This is because stack implement LIFO order, the last element insert to the stack will be delete first
    }
}
