package com.Lab_Tuto.Tuto_from_snr.Tuto_3.Q1;

public class d {

    public static void main(String[] args) {
        int decimal = 6;
        toBinary(decimal);
    }

    public static void toBinary(int decimal) {
        if (decimal < 1)
            System.out.print("");
        else {
            toBinary(decimal / 2);  // reverse the binary, if not ans = 011
            System.out.print(decimal % 2);
        }
    }
}
