package com.Lab_Tuto.Tuto.Tuto_3.Q1;

import java.util.Scanner;

public class CandyMachine {
    public static void main(String[] args) {

        Dispenser candies = new Dispenser("Candies", 20, 2.00);
        Dispenser chips = new Dispenser("Chips", 20, 1.50);
        Dispenser gum = new Dispenser("Gum", 20, 1.00);
        Dispenser cookies = new Dispenser("Cookies", 20, 2.50);

        CashRegister cashRegister = new CashRegister(100);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Candy Machine!!! (Press 1 to buy, 2 to exit)");
        String press = sc.next();

        while (!press.equals("2")) {

            System.out.println("1." + candies.toString());
            System.out.println("2." + chips.toString());
            System.out.println("3." + gum.toString());
            System.out.println("4." + cookies.toString());

            System.out.print("Select your item: ");
            int item = sc.nextInt();
            double price = 0;
            Dispenser currentItem = new Dispenser();

            switch (item) {
                case 1:
                    price = candies.getPriceItem();
                    currentItem = candies;
                    break;
                case 2:
                    price = chips.getPriceItem();
                    currentItem = chips;
                    break;
                case 3:
                    price = gum.getPriceItem();
                    currentItem = gum;
                    break;
                case 4:
                    price = cookies.getPriceItem();
                    currentItem = cookies;
                    break;
            }

            System.out.println("\nThe item you choose is " + currentItem.getItem());
            System.out.printf("Price item: RM%.2f", price);

            System.out.println("\nPlease insert your money");
            System.out.println("RM 1    RM0.10");
            System.out.println("RM 5    RM0.20");
            System.out.println("RM 10   RM0.50");
            System.out.println("RM 20");
            System.out.println("RM 50");
            System.out.println("RM 100");
            double customerMoney = 0;
            String moneyInsert = "";
            while (!cashRegister.acceptMoney(customerMoney, currentItem)) {
                System.out.println("Insert you money by entering the amount (press 'p' to purchase, press 'e' to exit)");
                moneyInsert = sc.next();
                if (moneyInsert.equals("p") || moneyInsert.equals("e"))
                    if (!cashRegister.acceptMoney(customerMoney, currentItem)) {
                        System.out.println("Not enough money");
                        continue;
                    }
                    else
                        break;
                customerMoney += Double.parseDouble(moneyInsert);
            }
            cashRegister.setCustomerMoney(customerMoney);

            System.out.printf("The price item : RM%.2f\n", price);
            System.out.printf("Customer money : RM%.2f\n", customerMoney);
            System.out.printf("Your change : RM%.2f\n", cashRegister.getChange(currentItem));
            System.out.println("\n One " + currentItem.getItem() + " is sold out");
            currentItem.setNumberOfItem(1);

            System.out.println("Welcome to Candy Machine!!! (Press 1 to buy, 2 to exit)");
            press = sc.next();
        }

        System.out.println("Thank you!!! See u again");
    }
}
