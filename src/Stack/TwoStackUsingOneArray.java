package Stack;

public class TwoStackUsingOneArray<E> {
    private E[] array;
    private int size_1;
    private int size_2;
    private int index_1;
    private int index_2;
    private E top_1;
    private E top_2;

    public TwoStackUsingOneArray(int size_1, int size_2) {
        array = (E[]) new Object[size_1 + size_2];
        this.size_1 = size_1;
        this.size_2 = size_2;
        index_1 = -1;
        index_2 = size_1 - 1;
    }

    public void push1(E element) {
        index_1++;
        if (index_1 < size_1) {
            array[index_1] = top_1 = element;
        }
        else
            System.out.println("Stack 1 is full");
    }

    public void push2(E element) {
        index_2++;
        if (index_2 < array.length)
            array[index_2] = top_2 = element;
        else
            System.out.println("Stack 2 is full");
    }

    public E pop1() {
        E e1 = top_1;
        array[index_1] = null;
        top_1 = array[--index_1];

        return e1;
    }

    public E pop2() {
        E e2 = top_2;
        array[index_2] = null;
        top_2 = array[--index_2];

        return e2;
    }

    public void display1() {
        System.out.print("Stack 1: ");
        for (int i = 0; i < size_1; i++) {
            if (array[i] == null) break;
            if (i == size_1 - 1) System.out.print(array[i]);
            else System.out.print(array[i] + " --> ");
        }
        System.out.println();
    }

    public void display2() {
        System.out.print("Stack 2: ");
        for (int i = size_1; i < array.length; i++) {
            if (array[i] == null) break;
            if (i == array.length - 1) System.out.print(array[i]);
            else System.out.print(array[i] + " --> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoStackUsingOneArray<Integer> a = new TwoStackUsingOneArray<>(3, 5);
        a.push1(1);
        a.push1(2);
        a.push1(3);
        a.pop1();
        a.display1();
        a.push1(11);

        a.push2(4);
        a.push2(5);
        a.push2(6);
        a.push2(7);
        a.push2(8);
        a.pop2();
        a.display2();
        a.push2(9);
    }
}
