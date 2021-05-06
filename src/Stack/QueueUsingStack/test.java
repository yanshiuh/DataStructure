package Stack.QueueUsingStack;

public class test {

    public static void main(String[] args) {
        QueueByStack<Integer> a = new QueueByStack<>();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        System.out.println(a.getSize());
        System.out.println(a);
        System.out.println(a.dequeue());
        a.enqueue(7);
        System.out.println(a);

//        System.out.println(a.getSize());
//
//        System.out.println(a);
//
//        a.dequeue();
//        System.out.println(a);
    }
}
