package com.Lab_Tuto.Lab_from_snr.Lab_1;

public class Tester {

    public static void main(String[] args) {
//        Time time_1 = new Time(13, 45);
//        System.out.println(time_1.toString());
//        Time time_2 = new Time(33, 45);
//        System.out.println(time_2.toString());
//        Time time_3 = new Time(10, 52);
//        System.out.println(time_3.toString());
//
//        System.out.println();
//
//        double[] coefficient = {4.0, 2.0, -0.5, -20.0};
//        Polynomial a = new Polynomial(3, coefficient);
//        System.out.println("The polynomial is " + a.show_Polynomial());
//        System.out.println(a.toString());
//
//        System.out.println();

//        SimpleNetwork network_1 = new SimpleNetwork("Host 1", "10.1.1.1", "255.255.255.224", "UP");
//        SimpleNetwork network_2 = new SimpleNetwork("Host 2", "10.1.1.2", "255.255.255.224", "DOWN");
//        SimpleNetwork network_3 = new SimpleNetwork("Host 3", "10.1.1.70", "255.255.255.224", "UP");
//        SimpleNetwork network_4 = new SimpleNetwork("Host 4", "10.1.1.15", "255.255.255.224", "UP");
//
//        System.out.println(network_1.toString());
//        System.out.println(network_2.toString());
//        System.out.println(network_3.toString());
//        System.out.println(network_4.toString());
//
//        System.out.println(network_2.check_connection(network_1));
//        System.out.println(network_2.check_connection(network_3));
//        System.out.println(network_2.check_connection(network_4));

        TextFile text = new TextFile();
        text.writeFile();
        text.readFile();

        BinaryFile binary = new BinaryFile();
        binary.writeFile();
        binary.readFile();
    }
}
