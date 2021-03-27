package com.Lab_Tuto.Tuto_from_snr.Tuto_1;

public class SmartPhone implements Comparable<SmartPhone>{
    private String model;
    private int price;

    public SmartPhone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(SmartPhone other) {
        if (this.getPrice() < other.getPrice())
            return -1;
        else if (this.getPrice() > other.getPrice())
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return model + " (RM " + price + ")";
    }
}
