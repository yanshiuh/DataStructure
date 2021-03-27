package com.Lab_Tuto.Lab.Lab_2;

public class FindMax {

    static class Circle implements Comparable<Circle> {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public String toString() {
            return "Radius: " + radius;
        }

        @Override
        public int compareTo(Circle o) {
            if (this.radius < o.radius) return -1;
            else if (this.radius > o.radius) return 1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] colors = {"red", "green", "blue"};
        Circle[] circles = {new Circle(3.0), new Circle(2.9), new Circle(5.9)};

        System.out.println(max(nums));
        System.out.println(max(colors));
        System.out.println(max(circles));
    }

    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(max) > 0)
                max = list[i];
        }

        return max;
    }
}
