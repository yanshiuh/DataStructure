package com.Lab_Tuto.Tuto_from_snr.Tuto_1;

public class Tester {

    public static void main(String[] args) {
        // Question 1
        Tarikh tarikh_1 = new Tarikh("5","11","2016");
        System.out.println(tarikh_1.toString());

        System.out.println();

        // Question 2
        Sentence sentence_1 = new Sentence("How are you?");
        System.out.println(sentence_1.toString());

        System.out.println();

        // Question 3
        ISP isp = new ISP(5,50);
        System.out.println(isp.toString());
        DPlan dPlan = new DPlan(5,50);
        System.out.println(dPlan.toString());
        MPlan mPlan = new MPlan(5,50);
        System.out.println(mPlan.toString());
        if (dPlan.getPrice() < mPlan.getPrice())
            System.out.println("DPlan is cheaper as compared to MPlan");
        else
            System.out.println("MPlan is cheaper as compared to DPlan");

        System.out.println();

        // Question 4
        SmartPhone[] smartPhones = new SmartPhone[4];
        smartPhones[0] = new SmartPhone("iPhone", 2400);
        smartPhones[1] = new SmartPhone("Samsung", 2200);
        smartPhones[2] = new SmartPhone("Nokia", 1400);
        smartPhones[3] = new SmartPhone("LG", 1800);

        System.out.println("List of Smart Phone:");
        for (int i = 0; i < smartPhones.length; i++) {
            System.out.print(smartPhones[i].toString() + " ");
        }

        System.out.println("\nList of Smart Phone in ascending order: ");
        SmartPhone cheapest = smartPhones[0];
        for (int pass = 1; pass < smartPhones.length; pass++) {     // bubble sort
            for (int j = 0; j < smartPhones.length - 1; j++) {
                if (smartPhones[j].compareTo(smartPhones[j + 1]) > 0) {
                    SmartPhone temp = smartPhones[j];
                    smartPhones[j] = smartPhones[j + 1];
                    smartPhones[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < smartPhones.length; i++) {
            System.out.print(smartPhones[i].toString() + " ");
        }
    }
}
