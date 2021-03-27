package com.Lab_Tuto.Lab_from_snr.Lab_2;

public class Array_List_form<T extends Comparable<T>> implements General_Form<T> {
    private T[] numbers;
    private int index;
    private int N;

    public Array_List_form(int n) {
        N = n;
        index = -1;
        numbers = (T[]) new Comparable[N];
    }

    @Override
    public void insert(T data) {
        index++;
        numbers[index] = data;
    }

    @Override
    public T[] sort() {
        for (int pass = 1; pass < numbers.length; pass++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i + 1].compareTo(numbers[i]) < 0) {
                    T temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }

    @Override
    public boolean isRepeat(T data) {
        for (int i = 0; i < index + 1; i++) {
            if (data.compareTo(numbers[i]) == 0)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Array Implementation\n";
        for (T num: sort())
            result += num + " ";

        return result;
    }
}
