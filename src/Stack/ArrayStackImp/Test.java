package Stack.ArrayStackImp;

public class Test {

    public static void main(String[] args) {
        ArrayStack<Integer> a = new ArrayStack<>();
        a.push(1);
        a.push(2);
        a.push(3);

        if (a.contains(3))
            System.out.println("3 is true");

        a.pop();

        System.out.println(a.peek());

        System.out.println("Position of 2 in stack: " + a.search(2));

        System.out.println(a);
    }
}
