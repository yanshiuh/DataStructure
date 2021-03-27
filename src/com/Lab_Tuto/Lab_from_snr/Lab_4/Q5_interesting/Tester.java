package com.Lab_Tuto.Lab_from_snr.Lab_4.Q5_interesting;

public class Tester {

    public static void main(String[] args) {
        LinkedList<String> q5 = new LinkedList<>();
        q5.insert("ARS");
        q5.insert("AST");
        q5.insert("CHE");
        q5.insert("LEI");
        q5.insert("MAN");
        q5.insert("LIV");
        q5.insert("TOT");
        System.out.print("The list consists of ");
        q5.showList();

        System.out.println("\nRemove all the words that consists of the A character using iterator");
        LinkedList<String>.LinkedListIterator iterator = q5.new LinkedListIterator();
        while (iterator.iterator.hasNext()) {
            if (iterator.iterator.next() != null)
                q5.delete((String) iterator.iterator.next());
        }
        System.out.print("The updated list consists of ");
        q5.showList();

    }
}
