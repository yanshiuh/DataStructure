package com.Lab_Tuto.Tuto_from_snr.Tuto_2;

public class Generic_method {

    public static void main(String[] args) {
        compare("Hello", "World");
        compare(12.4, 64.3);
        compare(20, 35);
        compare("Welcome", "Welcome");

//        maximum(42, 15, 58);
//        maximum(12.45, 41.28, 19.82);

    }

    public static <T extends Comparable<T>> void compare(T first, T second) {
        System.out.println("The parameters value are : " + first + " and " + second);
        String classType = first.getClass().getSimpleName();

        switch (classType) {
            case "Integer":
                System.out.println("The sum of the " + classType.toLowerCase() + " is " + ((Integer) first + (Integer) second));
                break;
            case "Double":
                System.out.println("The sum of the " + classType.toLowerCase() + " is " + ((Double) first + (Double) second));
                break;
            case "String":
                if (first.compareTo(second) == 0)
                    System.out.println("The string is equal");
                else
                    System.out.println("The string is not equal");
                break;
        }
    }

    public static <E extends Comparable<E>> void maximum(E num_1, E num_2, E num_3) {
        E max = num_1;

        if (num_2.compareTo(max) > 0)
            max = num_2;
        else if (num_3.compareTo(max) > 0)
            max = num_3;

        System.out.println("The maximum value of " + num_1 + " " + num_2 + " " + num_3 + " is " + max);
    }
}
