package com.Lab_Tuto.Lab.Lab_6.Q1_Q2;

public class TestMyStack {

    public static void main(String[] args) {
        // Q1(b)
        MyStack<Character> a = new MyStack<>();
        a.push('a');
        a.push('b');
        a.push('c');

        System.out.println(a);

        if (a.search('b'))
            System.out.println("[b]");

        if (a.search('k'))
            System.out.println("[k]");

        // Q1(c)
        MyStack<Integer> b = new MyStack<>();
        b.push(1);
        b.push(2);
        b.push(3);

        System.out.println("\n" + b);

        if (b.search(6))
            System.out.println("[6]");
    }
}
