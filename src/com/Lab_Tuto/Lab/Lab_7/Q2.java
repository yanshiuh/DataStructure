package com.Lab_Tuto.Lab.Lab_7;

import com.Lab_Tuto.Lab.Lab_7.Q1.MyQueue;

public class Q2 {

    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(palindromeQueue(s));
    }

    public static boolean palindromeQueue(String s) {
        MyQueue<Character> queue = new MyQueue<>();

        int times = s.length() % 2 == 0 ? s.length() / 2 : s.length() / 2 + 1;
        for (int i = 0; i < times; i++)
            queue.enqueue(s.charAt(i));

        for (int i = s.length() - 1; i >= times - 1 ; i--) {
            if (queue.isEmpty()) break;
            else if (s.charAt(i) == queue.peek()) queue.dequeue();
        }

        return queue.isEmpty();
    }
}
