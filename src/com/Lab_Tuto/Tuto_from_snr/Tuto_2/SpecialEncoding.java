package com.Lab_Tuto.Tuto_from_snr.Tuto_2;

public class SpecialEncoding<T> {
    private T[] list;

    public SpecialEncoding(T[] list) {
        this.list = list;
    }

    public String command(T value) {
        if (value.equals(0) || value.equals('C')) return  "Copy";
        else if (value.equals(1) || value.equals('D')) return  "Delete";
        else if (value.equals(2) || value.equals('I')) return  "Insert";
        else if (value.equals(3) || value.equals('P')) return  "Print";
        else if (value.equals(4) || value.equals('R')) return  "Rename";
        else if (value.equals(5) || value.equals('V')) return  "Paste";

        return null;
    }

    @Override
    public String toString() {
        String result = "The Code is ";
        for (T value: list) {
            result += value + " ";
        }
        result += "\nThe Command is ";

        for (T value: list) {
            result += command(value) + " ";
        }
        return result;
    }
}
