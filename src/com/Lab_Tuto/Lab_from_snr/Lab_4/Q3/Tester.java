package com.Lab_Tuto.Lab_from_snr.Lab_4.Q3;

public class Tester {

    public static void main(String[] args) {
        Course programming = new Course("WXX101", "Programming", "B",5);
        Course networking = new Course("WXX201", "Networking", "C", 4);
        Course operatingSystem = new Course("WXX301", "Operating System", "A",3);

        LinkedList list = new LinkedList();
        list.insert(programming);
        list.insert(networking);
        list.insert(operatingSystem);

        System.out.println("The list consists of");
        list.showList();

        int totalPoint = programming.getPoint() + networking.getPoint() + operatingSystem.getPoint();
        System.out.println("The total point is " + totalPoint);

        int creditHours = programming.getCreditHours() + networking.getCreditHours() +
                    operatingSystem.getCreditHours();
        System.out.println("Total credit is " + creditHours);

        double average = (double) totalPoint / creditHours;
        System.out.printf("Grade point average is %.2f", average);

    }
}
