package com.Lab_Tuto.Tuto_from_snr.Tuto_4.Q3_Q4_Q5_Q6;

public class Tester {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the total amount: ");
//        int amount = sc.nextInt();
//        System.out.println("Total amount: " + amount );
//
//        LinkedList<Integer> notes = new LinkedList<>();
//        notes.insert(100);
//        notes.insert(50);
//        notes.insert(20);
//        notes.insert(10);
//        notes.insert(5);
//        notes.insert(1);
//
//        LinkedList<Integer> numberOfNotes = new LinkedList<>();
//        for (int i = 0; i < notes.length(); i++) {
//            int count = 0;
//            while (amount >= notes.get(i)) {
//                if (amount - notes.get(i) >= 0) {
//                    count++;
//                    amount -= notes.get(i);
//                }
//            }
//            numberOfNotes.insert(count);
//        }
//
//        notes.showCombineList(numberOfNotes);

        // ----------------------------------------------------------------------
        // Q4
//        LinkedList<Integer> q4 = new LinkedList<>();
//        q4.insert(23);
//        q4.insert(15);
//        q4.insert(17);
//        q4.insert(28);
//        q4.insert(12);
//        q4.insert(40);
//        q4.showList();
//        System.out.println("\nLinked List has " + q4.length() + " node(s)");
//        System.out.println("Total is " + q4.sum());
//        System.out.println("Total even number is " + q4.countEven());
//        // the ans in question are wrong, total = 135, even = 3



        // ----------------------------------------------------------------------
        // Q5
//        LinkedList<Integer> q5 = new LinkedList<>();
//        for (int i = 0; i < 15; i++)
//            q5.generateAndInsert();
//        System.out.println("Linked List has " + q5.length() + " node(s)");
//        q5.showList();
//        System.out.println("\nDelete the number 4 from the list");
//        q5.deleteSpecifiedValue(4);
//        q5.showList();

        // -------------------------------------------------------------------------
        // Q6
        LinkedList<Integer> q6 = new LinkedList<>();
        q6.addFront(78);
        q6.addFront(45);
        q6.addFront(34);
        q6.addFront(23);
        q6.addFront(17);
        q6.addFront(10);
        q6.addFront(8);
        q6.showList();
        System.out.println("\nThe median is " + q6.median());

    }
}
