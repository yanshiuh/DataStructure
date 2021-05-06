package com.Lab_Tuto.Lab.Lab_7.Q3;

import com.sun.jdi.event.StepEvent;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each)");
        String query = sc.nextLine();

        MyQueue<Integer> totalShare = new MyQueue<>();
        MyQueue<Integer> totalPrice = new MyQueue<>();

        int gainOrLoss = 0;
        while (!query.isEmpty()) {
            String[] words = query.split(" ");
            int share = Integer.parseInt(words[1]);
            int price = Integer.parseInt(words[4].substring(1));

            if (words[0].equals("Buy")) {
                System.out.println("Buying now...");
                totalShare.enqueue(share);
                totalPrice.enqueue(price);
            } else {
                System.out.println("Selling the shares now...");
                while (share > 0 && !totalShare.isEmpty()) {
                    int diff = price - totalPrice.peek();
                    if (share >= totalShare.peek()) {
                        share -= totalShare.peek();
                        gainOrLoss += diff * totalShare.peek();
                        totalShare.dequeue();
                        totalPrice.dequeue();
                    } else {
                        totalShare.set(0, totalShare.peek() - share);
                        gainOrLoss += diff * share;
                        share = 0;
                    }
                    System.out.println("Total Capital Gain/Loss: " + gainOrLoss);
                }
                if (share > 0)
                    System.out.println("No share to sell");
            }
            totalShare.display("Share");
            totalPrice.display("Price");

            System.out.println("Enter your query (In format 'Buy / Sell x shares at $y each)");
            query = sc.nextLine();
        }
        System.out.println("Final Capital Gain/Loss: " + gainOrLoss);
    }

    // Buy 100 shares at $10 each
    // Buy 50 shares at $20 each
    // Sell 50 shares at $20 each
    // Sell 60 shares at $30 each
    // Sell 50 shares at $35 each
}
