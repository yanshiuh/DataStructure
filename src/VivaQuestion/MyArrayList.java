package VivaQuestion;

public class MyArrayList<T> {
    T[] array;
    private int size = 10;
    private int index = 0;

    public MyArrayList() {
        array = (T[]) new Object[size];
    }

    public MyArrayList(int size) {
        this.size = size;
    }

    public void add(T element) {
        if (index < size) {
            array[index] = element;
            index++;
        } else {
            size *= 2;
            T[] newArray = (T[]) new Object[size];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = element;
            index++;
            newArray = array;
        }
    }

    public void add(int index, T element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Invalid index");
        else if (index == size)
            add(element);
        else {
            for (int i = index; i < array.length; i++) {
                array[i + 1] = array[i];
            }
            array[index] = element;
            size++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Invalid index");
        else {
            for (int i = index; i < array.length; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public T get(int position) {
        if (position < index)
            return array[position];
        else {
            System.out.println("Invalid index");
            return null;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }
        return res;
    }
}
