package Recursion.Recursive_Void_Method;

public class Example_2_reverse {

    public static void main(String[] args) {
        String str = "Kee";
        reverse(str, str.length());
    }

    public static void reverse(String str, int size) {
        if (size == 1)                              // base call
            System.out.print(str.charAt(size - 1));
        else {
            System.out.print(str.charAt(size - 1));
            reverse(str, --size)    ;               // recursive call
        }
    }
}
