package com.Lab_Tuto.Lab.Lab_6;


import java.util.Scanner;
import java.util.Stack;

public class Q5 {

    static int N;

    static Stack<Integer> source = new Stack<>();
    static Stack<Integer> destination = new Stack<>();
    static Stack<Integer> auxiliary = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int num = sc.nextInt();
        N = num;
        insertDisks(N);

    }

    public static void insertDisks(int N) {
        for (int i = N; i > 0; i--) {
            source.push(i);
        }
        display();
        move(N, source, auxiliary, destination);
    }

    public static <E> void move(int n, Stack<E> a, Stack<E> b, Stack<E> c) {
        if (n > 0) {
            move(n - 1, a, c, b);
            E x = a.pop();
            c.push(x);
            display();
            move(n - 1, b, a, c);
        }
    }

    public static <E> void display() {
        for(int i = N - 1; i >= 0; i--) {
            String d1 = " ", d2 = " ", d3 = " ";
            try {
                d1 = String.valueOf(source.get(i));
            } catch (Exception e) {
            }
            try {
                d2 = String.valueOf(auxiliary.get(i));
            } catch (Exception e) {
            }
            try {
                d3 = String.valueOf(destination.get(i));
            } catch (Exception e) {
            }
            System.out.println("  " + d1 + "  |  " + d2 + "  |  " + d3);
        }
        System.out.println(" ---------------");
        System.out.println("  A  |  B  |  C");
        System.out.println(" ---------------\n");

    }
}
