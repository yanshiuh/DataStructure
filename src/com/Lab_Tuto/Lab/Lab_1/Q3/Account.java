package com.Lab_Tuto.Lab.Lab_1.Q3;

import java.time.LocalDateTime;
import java.util.Date;

public class Account {
    private int id;
    private double balance, annualInterestRate;
    private Date dateCreated;


    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = java.util.Calendar.getInstance().getTime();
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
        } else
            System.out.println("Not enough money");
    }

    public void deposit(double money) {
        balance += money;
    }

    @Override
    public String toString() {
        return String.format("Balance: RM%.2f \nMonthly interest: RM%.2f \nDate: "+ dateCreated,balance,getMonthlyInterest());
    }
}
