package Generic;

public class ArrayLog<T extends Comparable<T>> implements SimpleLog<T> {
    private T[] arrayLog;
    private int index, size;

    public ArrayLog(int size) {
        index = -1;
        this.size = size;
        arrayLog = (T[]) new Comparable[size];
    }

    @Override
    public void insert(T item) {
        if (!isFull()) {
            index++;
            arrayLog[index] = item;
        }
        else
            System.out.println("The log is full");
    }

    @Override
    public boolean isFull() {
        return (index+1) == arrayLog.length;
    }

    @Override
    public int getSize() {
        return index+1;
    }

    @Override
    public boolean search(T item) {
        for (int i = 0; i < arrayLog.length; i++) {
            if (arrayLog[i] == null) {
                return false;
            }
            else if (arrayLog[i].compareTo(item) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arrayLog.length; i++) {
            arrayLog[i] = (T) null;
        }
        index = -1;
    }

    @Override
    public void remove(T item) {
        for (int i = 0; i < index; i++) {
            if (arrayLog[i].compareTo(item) == 0) {
                arrayLog[i] = null;
            }
        }
        index--;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i <= index; i++) {
            str += arrayLog[i] + " ";
        }
        return str;
    }
}
