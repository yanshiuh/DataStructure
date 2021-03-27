package com.Lab_Tuto.Tuto.Tuto_2;

public class MyArray {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Jane", "Tom", "Bob"};
        Character[] alphabets = {'a', 'b', 'c'};

        listAll(numbers);
        listAll(names);
        listAll(alphabets);

        MyArray.listAll(numbers);
        MyArray.listAll(names);
        MyArray.listAll(alphabets);
    }

    public static <E> void listAll(E[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
