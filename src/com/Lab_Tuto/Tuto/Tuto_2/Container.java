package com.Lab_Tuto.Tuto.Tuto_2;

public class Container<T> {
    private T t;

    public Container() {
    }

    public void add(T item) {
        t = item;
    }

    public <T> T retrieve() {
        return (T) t;
    }

    @Override
    public String toString() {
        return "The " + t.getClass().getSimpleName() + " container has " + retrieve();
    }

    public static void main(String[] args) {
        Container<Integer> a = new Container<>();
        Container<String> b = new Container<>();

        a.add(50);
        b.add("Java");

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
