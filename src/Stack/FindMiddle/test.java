package Stack.FindMiddle;

public class test {

    public static void main(String[] args) {
        MyStack<Integer> a = new MyStack<>();
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);

        a.deleteMiddle();

        a.display();

        System.out.println("Middle element: " + a.findMiddle());
    }
}
