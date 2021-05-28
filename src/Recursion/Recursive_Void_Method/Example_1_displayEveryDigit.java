package Recursion.Recursive_Void_Method;

public class Example_1_displayEveryDigit {

    public static void main(String[] args) {
        displayDigit(12345);
    }

    public static void displayDigit(int n) {  // normally recursive method no static
        if (n < 10)                   // base call = n < 10
            System.out.println(n);
        else {
            displayDigit(n / 10);  // recursive call
            System.out.println(n % 10);
        }
    }
}
