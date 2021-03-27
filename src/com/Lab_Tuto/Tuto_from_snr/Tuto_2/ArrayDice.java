package com.Lab_Tuto.Tuto_from_snr.Tuto_2;

import java.util.Random;

public class ArrayDice implements Dice {
    private int number_of_rolls;

    public ArrayDice(int number_of_rolls) {
        this.number_of_rolls = number_of_rolls;
    }

    @Override
    public int[] timesOfRolls() {
        Random r = new Random();
        int[] values = new int[number_of_rolls];
        for (int i = 0; i < values.length; i++)
            values[i] = r.nextInt(5) + 1;

        return values;
    }

    @Override
    public String toString() {
        int sum = 0;
        String result = "Array Implementation: Roll " + number_of_rolls + " time(s)\n";
        for (int v: timesOfRolls()) {
            result += v + " ";
            sum += v;
        }
        result += "\nTotal is " + sum;

        return result;
    }
}
