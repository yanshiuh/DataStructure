package com.Lab_Tuto.Tuto.Tuto_3.Q1;

public class CashRegister extends Dispenser {
    private double totalMoney, customerMoney, change;

    public CashRegister() {
    }

    public CashRegister(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void setCustomerMoney(double customerMoney) {
        this.customerMoney = customerMoney;
    }

    public boolean acceptMoney(double customerMoney, Dispenser currentItem) {
        return customerMoney >= currentItem.getPriceItem();
    }

    public double getChange(Dispenser currentItem) {
        if (customerMoney > currentItem.getPriceItem()) {
            change = customerMoney - currentItem.getPriceItem();
            totalMoney = totalMoney + customerMoney - change;
            return change;
        }
        else if (customerMoney == super.getPriceItem())
            return 0;

        return 0;
    }
}
