package com.Lab_Tuto.Lab.Lab_2.Q2;

public class tester {

    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj = new MyGeneric<>();

        strObj.setE("Kevin Durant");
        intObj.setE(35);

        System.out.println(strObj.getE() + " " + intObj.getE());
    }
}
