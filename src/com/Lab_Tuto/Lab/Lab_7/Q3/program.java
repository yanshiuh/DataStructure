package com.Lab_Tuto.Lab.Lab_7.Q3;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your query (b = buy, s = sell, e = exit");
        String query = sc.nextLine();

        MyQueue<Integer> totalShare = new MyQueue<>();
        MyQueue<Integer> price = new MyQueue<>();

        int share, pricePerShare;
        int sellShare, sellPrice;
        while (!query.equalsIgnoreCase("e")) {
            if (query.equalsIgnoreCase("b")) {
                System.out.println("Process to buy...");

                System.out.print("Number of shares: ");
                share = sc.nextInt();
                totalShare.enqueue(share);

                System.out.print("Price per share: ");
                pricePerShare = sc.nextInt();
                price.enqueue(pricePerShare);

                System.out.println("Success to buy!");

                totalShare.display("Share");
                price.display("Price");
            } else {
                System.out.println("Process to sell...");

                System.out.print("Number of shares: ");
                sellShare = sc.nextInt();

            }
        }
    }
}
