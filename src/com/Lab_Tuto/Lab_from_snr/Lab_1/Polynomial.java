package com.Lab_Tuto.Lab_from_snr.Lab_1;

import java.util.Scanner;

public class Polynomial {
    private int degree;
    private double[] coefficientInArray;
    private double x;

    public Polynomial(int degree, double[] coefficientInArray) {
        this.degree = degree;
        this.coefficientInArray = coefficientInArray;
    }

    public String show_Polynomial() {
        String[] coefficient = new String[coefficientInArray.length];
        for (int i = 1; i < coefficientInArray.length; i++) {
            if (coefficientInArray[i] > 0) {
                coefficient[i] = "+" + coefficientInArray[i];
            } else {
                coefficient[i] = "" + coefficientInArray[i];
            }
        }
        return coefficientInArray[0]+"x^3 " + coefficient[1]+"x^2 " + coefficient[2]+"x " +
                coefficient[3];
    }

    public double compute() {
        return  coefficientInArray[0] * (Math.pow(x, degree)) +
                coefficientInArray[1] * (Math.pow(x, degree - 1)) +
                coefficientInArray[2] * (Math.pow(x, degree - 2)) +
                coefficientInArray[3];
    }

    @Override
    public String toString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("when x = ");
        x = sc.nextDouble();

        return show_Polynomial() + " = " + compute();
    }
}
