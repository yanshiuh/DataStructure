package com.Lab_Tuto.Tuto_from_snr.Tuto_1;

public class MPlan extends ISP {
    private double price;

    public MPlan(int mbps, int GB) {
        super(mbps, GB);
    }

    public double charge_mbps() {
        return super.mbps * 5;
    }

    public double charge_GB() {
        return super.GB * 0.8;
    }

    public double getPrice() {
        return charge_GB() + charge_mbps();
    }

    @Override
    public String toString() {
        return String.format("Plan : MPlan with price RM%.2f", charge_mbps() + charge_GB());
    }
}
