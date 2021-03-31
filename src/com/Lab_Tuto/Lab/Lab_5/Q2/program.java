package com.Lab_Tuto.Lab.Lab_5.Q2;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        StudentList<String> list = new StudentList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your student name list. Enter 'n' to end....");
        String enterName = sc.nextLine();
        while (!enterName.equals("n")) {
            list.add(enterName);
            enterName = sc.nextLine();
        }
        System.out.println("\nYou have entered the following students' name : ");
        list.printList();

        System.out.println("\nThe number of students entered is : " +list.getSize());

        System.out.println("\nAll the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed");
        String rename = sc.nextLine();
        if (rename.equals("r")) {
            System.out.println("Enter the existing student name that u want to rename : ");
            String name = sc.nextLine();
            System.out.println("Enter the new name: ");
            String newName = sc.nextLine();
            list.replace(name, newName);
        }

        System.out.println("\nThe new student list is : ");
        list.printList();

        System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed");
        String remove = sc.nextLine();
        if (remove.equals("y")) {
            System.out.println("Enter a student name to remove : ");
            String name = sc.nextLine();
            list.removeElement(name);
        }

        System.out.println("The number of updated student is : " + list.getSize());
        System.out.println("The updated student list is : ");
        list.printList();

        System.out.println("\nAll students data captured complete. Thank you!");
    }
}
