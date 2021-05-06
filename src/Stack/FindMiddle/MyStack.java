package Stack.FindMiddle;

public class MyStack<E> {
    DLLNode<E> head;
    DLLNode<E> mid;
    int size;

    public MyStack() {
        size = 0;
    }

    public void push(E element) {
        DLLNode<E> newNode = new DLLNode<>(element, head, null);
        size++;

        if (size == 1)
            mid = newNode;
        else {
            head.previous = newNode;

            if (size % 2 == 0)
                mid = mid.previous;
        }
        head = newNode;
    }

    public E pop() {
        if (size == 0) {
            System.out.println("The stack is empty");
            return null;
        }

        E item = head.element;
        head = head.next;
        if (head != null)
            head.previous = null;

        size--;

        if (size % 2 != 0)
            mid = mid.next;

        return item;
    }

    public E findMiddle(){
        if (size == 0) {
            System.out.println("The stack is empty");
            return null;
        }

        return mid.element;
    }

    public E deleteMiddle() {
        if (size == 0) {
            System.out.println("The list is empty");
            return null;
        }

        E item = mid.element;
        size--;

        if (size == 1) {
            head = head.next;
            mid = head;
        } else {
            mid.previous.next = mid.next;
            mid.next.previous = mid.previous;

            if (size % 2 == 0)
                mid = mid.previous;
            else
                mid = mid.next;
        }

        return item;
    }

    public void display() {
        String r = "";
        DLLNode<E> currentNode = head;
        while (currentNode != null) {
            System.out.println("| " + currentNode.element + " |");
            currentNode = currentNode.next;
        }
        System.out.println("-----");
    }
}
