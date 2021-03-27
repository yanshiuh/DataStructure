package com.Lab_Tuto.Lab.Lab_1.Q4;

public class Test {

    public static void main(String[] args) {
        Account1 a = new Account1(1122, 1000, 1.5, "George");
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);

        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);

        System.out.println(a.toString());
    }
}
