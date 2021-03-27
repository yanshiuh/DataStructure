package com.Lab_Tuto.Lab_from_snr.Lab_2;

public class Q2Tester {

    public static void main(String[] args) {
        System.out.println("Create a text file log with maximum record equal to 5");

        TextFileLog<String> a = new TextFileLog<>(5);
        a.insert("James");
        a.insert("Ahmad");
        a.insert("Siti");
        a.insert("Ramesh");
        a.insert("John");
        System.out.println("Text File Log Size " + a.size());
        System.out.println(a.toString());

        System.out.println("Adding another record");
        if (!a.isFull())
            a.insert("Kee");
        else
            System.out.println("The log is full");

        System.out.println("Searching for Siti in the file");
        if (a.search("Siti"))
            System.out.println("The log contains Siti");
        else
            System.out.println("There is no record of Siti");

        System.out.println("Clear the text file");
        a.clear();
        System.out.println("Text File Log Size " + a.size());
    }
}
