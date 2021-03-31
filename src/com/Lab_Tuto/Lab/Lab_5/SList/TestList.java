package com.Lab_Tuto.Lab.Lab_5.SList;

public class TestList {

    public static void main(String[] args) {
        SList<String> a = new SList<>();
        a.appendEnd("Linked list");
        a.appendEnd("is");
        a.appendEnd("easy");

        a.display();

        System.out.println("\nThe remove element: " + a.removeInitial());

        if (a.contains("difficult"))
            System.out.println("True");
        else
            System.out.println("False");

        a.clear();
        a.display();
    }
}
