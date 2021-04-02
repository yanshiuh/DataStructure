package com.Lab_Tuto.Lab.Lab_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayBag<T> implements BagInterface<T> {
    private T[] bag;
    private int numberOfEntries;
    private final int DEFAULT_CAPACITY = 25;

    public ArrayBag() {
        this.numberOfEntries = 0;
        this.bag = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayBag(int maxSize) {
        if (maxSize <= 0)
            throw new IllegalArgumentException("maxSize must be > 0");

        this.numberOfEntries = 0;
        this.bag = (T[]) new Object[maxSize];
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == bag.length;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(Object newEntry) {
       if (newEntry == null)
           throw new IllegalArgumentException("Item cannot be null");
       else if (isFull())
           return false;   // no space
       else {
           this.bag[this.numberOfEntries] = (T) newEntry;
           this.numberOfEntries++;
           return true;
       }
    }

    @Override
    public T remove() {  // remove the last entry
        if (isEmpty()) return null;

        T removeItem = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries--;

        return removeItem;
    }

    @Override
    public boolean remove(Object anEntry) {
        if (isEmpty()) return false;

        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(anEntry)) {
                for (int j = i; j < numberOfEntries - 1; j++) {   // shift the item to left by one
                    bag[j] = bag[j + 1];
                }
                bag[numberOfEntries - 1] = null;

                numberOfEntries--;
                return true;
            }
        }
        return false;    // not found
    }

    @Override
    public void clear() {
        for (int i = 0; i < numberOfEntries; i++) {
            bag[i] = null;
            numberOfEntries--;
        }
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        int count = 0;
        for (int i = 0; i < numberOfEntries; i++) {
            if (bag[i].equals(anEntry))
                count++;
        }
        return count;
    }

    @Override
    public boolean contains(Object anEntry) {
        for (int i = 0; i < bag.length; i++) {
            if (bag[i].equals(anEntry))
                return true;
        }
        return false;
    }

    @Override
    public T[] toArray() {
        T[] copy = (T[]) new Object[numberOfEntries];

        for (int i = 0; i < numberOfEntries; i++)
            copy[i] = bag[i];

        return copy;
    }

    @Override
    public String toString() {
        String items = "{";

        for (int i = 0; i < numberOfEntries; i++) {
            items += bag[i];
            if (i != numberOfEntries - 1)
                items += ", ";
        }
        items += "}";

        return items;
    }

    @Override
    public BagInterface<T> union(BagInterface<T> otherBag) {
        BagInterface<T> everything = new ArrayBag<>();
        T[] otherBagItems = otherBag.toArray();

        for (int i = 0; i < numberOfEntries; i++) {
            everything.add(bag[i]);
        }

        for (T t : otherBagItems) {
            everything.add(t);
        }

        return everything;
    }

    @Override
    public BagInterface<T> intersection(BagInterface<T> otherBag) {
        List<T> list = new ArrayList<>();
        T[] otherBagItems = otherBag.toArray();
        for (int i = 0; i < numberOfEntries; i++) {
            for (int j = 0; j < otherBagItems.length; j++) {
                if (bag[i].equals(otherBagItems[j]) && !list.contains(bag[i])) {
                    int frequency_1 = this.getFrequencyOf(bag[i]);
                    int frequency_2 = otherBag.getFrequencyOf(otherBagItems[j]);
                    int frequency = Math.min(frequency_1, frequency_2);

                    for (int k = 0; k < frequency; k++) {
                        list.add(bag[i]);
                    }
                }
            }
        }

        ArrayBag<T> commonItems = new ArrayBag<>();
        for (int i = 0; i < list.size(); i++) {
            commonItems.add(list.get(i));
        }

        return commonItems;
    }

    @Override
    public BagInterface<T> difference(BagInterface<T> otherBag) {
        T[] otherBagItems = otherBag.toArray();
        for (int i = 0; i < numberOfEntries; i++) {
            for (int j = 0; j < otherBagItems.length; j++) {
                if (bag[i].equals(otherBagItems[j])) {
                    this.remove(bag[i]);
                    otherBag.remove(otherBagItems[j]);
                }
            }
        }

        ArrayBag<T> leftOver = new ArrayBag<>();
        for (int i = 0; i < numberOfEntries; i++) {
            leftOver.add(bag[i]);
        }

        return leftOver;
    }
}
