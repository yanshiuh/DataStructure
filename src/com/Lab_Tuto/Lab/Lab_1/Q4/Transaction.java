package com.Lab_Tuto.Lab.Lab_1.Q4;

public class Transaction {
    private java.util.Date date;
    private char type;
    private double amount, balance;
    private String description;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
