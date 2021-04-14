package com.Lab_Tuto.Lab.Lab_4;

public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList<String> a = new MyLinkedList<>();

        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        a.add("e");

        System.out.print("Print: ");
        a.print();

        System.out.print("\nReverse order: ");
        a.reverse();

//        System.out.println("\nNumber of element: " + (a.indexOf("e") + 1));
        int count = 0;
        while (a.get(count) != null)
            count++;
        System.out.println("\nNumber of elements: " + count);

        System.out.println("First element: " + a.getFirst());
        System.out.println("Last element: " + a.getLast());

        System.out.println("Delete middle value, " + a.getMiddleValue()); // a.getMiddleValue()

        System.out.println("2nd and 3rd elements: " + a.get(2) + " , " + a.get(3));

        if (a.contains("c"))
            System.out.println("List has the value 'c'");
        else
            System.out.println("There is not 'c' in the list");

        a.set(0, "h");
        a.set(1, "e");
        a.set(2, "l");
        a.set(3, "l");
        a.add(4, "o");

        System.out.print("New list: ");
        a.print();
    }
}
