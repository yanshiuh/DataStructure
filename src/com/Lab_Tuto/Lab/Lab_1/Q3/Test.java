package com.Lab_Tuto.Lab.Lab_1.Q3;

public class Test {

    public static void main(String[] args) {
        Account a = new Account(1122, 20_000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println(a.toString());
    }
}
