package com.Lab_Tuto.Lab.Lab_7.Q1;

public class test {

    public static void main(String[] args) {
        MyQueue<String> fruitQ = new MyQueue<>(new String[]{"Durian", "Blueberry"});
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        System.out.println(fruitQ.toString());

        System.out.println("Top item: " + fruitQ.peek());
        System.out.println("Queue size: " + fruitQ.getSize());
        fruitQ.dequeue();
        System.out.println("Item in index 2: " + fruitQ.getElement(2));
        System.out.println("Cherry item: " + fruitQ.contains("Cherry"));
        System.out.println("Durian item: " + fruitQ.contains("Durian"));

        if (!fruitQ.isEmpty())
            System.out.println(fruitQ.toString());
    }
}
