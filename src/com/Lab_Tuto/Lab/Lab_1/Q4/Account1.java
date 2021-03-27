package com.Lab_Tuto.Lab.Lab_1.Q4;

import com.Lab_Tuto.Lab.Lab_1.Q3.Account;

import java.util.ArrayList;
import java.util.Date;

public class Account1 extends Account {
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account1(int id, double balance, double annualInterestRate, String name) {
//        this.id = id;
//        this.balance = balance;
        super(id, balance);
        this.annualInterestRate = annualInterestRate;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double money) {
        if (money <= balance) {
            balance -= money;
            transactions.add(new Transaction('W', money, balance, String.format("Withdraw record RM%.2f",money)));
        } else
            System.out.println("Not enough money");
    }

    public void deposit(double money) {
        transactions.add(new Transaction('D', money, balance, String.format("Deposit record RM%.2f", money)));
        balance += money;
    }

    @Override
    public String toString() {
        String result = String.format("Account Holder Name: " + name +
                "\nBalance: RM%.2f \nMonthly interest rate: %.5f \nTransactions record: ", balance, getMonthlyInterestRate());
        for (int i = 0; i < transactions.size(); i++)
            result += "\n" + (i+1) + ". " + transactions.get(i).toString();

        return result;
    }
}
