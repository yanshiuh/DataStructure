package com.Lab_Tuto.Lab_from_snr.Lab_2;

public interface SimpleLog<T> {
    public void insert(T data);
    public boolean isFull();
    public int size();
    public boolean search(T data);
    public void clear();
    public String toString();
}
