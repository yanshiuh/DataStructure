package com.Lab_Tuto.Tuto_from_snr.Tuto_3;

public class Q3 {

    public static void main(String[] args) {
        System.out.println(writeLine('$',5));
        System.out.println(writeBlock('#',4,3));

    }

    public static String writeLine(char symbol, int times) {
        if (times == 0)
            return "";
        else {
            return symbol + writeLine(symbol, times - 1);
        }
    }

    public static String writeBlock(char symbol, int times, int lines) {
        if (lines == 0)
            return "";
        else {
            return writeLine(symbol, times) + "\n" + writeBlock(symbol, times, lines - 1);
        }
    }
}
