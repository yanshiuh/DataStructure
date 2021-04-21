package com.Lab_Tuto.Tuto.Tuto_7;

import java.util.PriorityQueue;

public class test {

    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        pQueue.offer("C++");
        pQueue.offer("Python");
        pQueue.offer("Java");
        pQueue.offer("Fortran");

        System.out.println("peek() gives us: "+ pQueue.peek());
    }
}
