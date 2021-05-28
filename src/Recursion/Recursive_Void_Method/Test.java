package Recursion.Recursive_Void_Method;

public class Test {

    public static void main(String[] args) {
        xMethod(1234567);
    }

    public static void xMethod(int n) {
        if (n != 0) {
            System.out.print(n + " ");
            xMethod(n / 10);
        }
    }
}
