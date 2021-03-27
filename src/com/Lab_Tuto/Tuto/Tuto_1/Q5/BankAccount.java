package com.Lab_Tuto.Tuto.Tuto_1.Q5;

public class BankAccount implements Account{
    private double balance;

    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public int deposit(int x) {
        return 0;
    }

    @Override
    public boolean withdraw(int money) {
        if (money <= balance) {
            balance -= money;
            return true;
        }
        return false;
    }
}
