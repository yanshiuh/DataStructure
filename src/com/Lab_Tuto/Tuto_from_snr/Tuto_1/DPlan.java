package com.Lab_Tuto.Tuto_from_snr.Tuto_1;

public class DPlan extends ISP {
    private double price;

    public DPlan(int mbps, int GB) {
        super(mbps, GB);
    }

    public double charge_mbps() {
        return super.mbps * 10;
    }

    public double charge_GB() {
        return super.GB * 0.2;
    }

    public double getPrice() {
        return charge_GB() + charge_mbps();
    }

    @Override
    public String toString() {
        return String.format("Plan : DPlan with price RM%.2f", charge_mbps() + charge_GB());
    }
}
