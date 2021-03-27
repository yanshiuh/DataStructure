package com.Lab_Tuto.Lab_from_snr.Lab_2;

public class TextFileLog<T extends Comparable<T>> implements SimpleLog<T> {
    private T[] list_of_data;
    private int index, data_size;

    public TextFileLog(int data_size) {
        this.data_size = data_size;
        list_of_data = (T[]) new Comparable[data_size];
        index = -1;
    }

    @Override
    public void insert(T data) {
        index++;
        list_of_data[index] = data;
    }

    @Override
    public boolean isFull() {
        return index + 1 == data_size;
    }

    @Override
    public int size() {
        return index + 1;
    }

    @Override
    public boolean search(T data) {
        for (int i = 0; i < list_of_data.length; i++) {
            if (data.compareTo(list_of_data[i]) == 0)
                return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < list_of_data.length; i++) {
            list_of_data[i] = null;
        }
        index =- 1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size(); i++) {
            result += list_of_data[i] + "\n";
        }

        return result;
    }
}
