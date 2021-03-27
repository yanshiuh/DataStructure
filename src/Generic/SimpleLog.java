package Generic;

public interface SimpleLog<T> {
    // insert item
    public void insert(T item);

    // check whether the log is full
    public boolean isFull();

    // get size
    public int getSize();

    // search item
    public boolean search(T item);

    // delete log
    public void clear();

    // display log
    public String toString();

    // remove item
    public void remove(T item);
}
