package com.Lab_Tuto.Tuto_from_snr.Tuto_5.Q2;

public class Q2 {

    public static void main(String[] args) {
        ArrayStackImplementation<Character> a = new ArrayStackImplementation<>();
        a.push('A');
        a.push('N');
        a.push('D');

        a.showStack();

        a.pop();
        a.showStack();
        System.out.println(a.getSize());
    }
}
