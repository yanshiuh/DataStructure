package com.Lab_Tuto.Tuto.Tuto_3.Q1;

public class Dispenser {
    private String item;
    private int numberOfItem;
    private double priceItem;

    public Dispenser() {
    }

    public Dispenser(String item, int numberOfItem, double priceItem) {
        this.item = item;
        this.numberOfItem = numberOfItem;
        this.priceItem = priceItem;
    }

    public void setNumberOfItem(int numberOfItemSold) {
        this.numberOfItem -= numberOfItemSold;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return String.format(" Item: %-10s" + " | Number of item: %5s" + " | Price: RM%5.2f", item, numberOfItem, priceItem);
    }
}
