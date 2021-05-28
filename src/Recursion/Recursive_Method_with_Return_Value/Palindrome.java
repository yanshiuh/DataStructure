package Recursion.Recursive_Method_with_Return_Value;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abbc";

        if (isPalindrome(str, 0, str.length() - 1))
            System.out.println(str + " is palindrome");
        else
            System.out.println("Not a palindrome");

        if (palindrome(str))
            System.out.println(str + " is palindrome");
        else
            System.out.println("Not a palindrome");
    }

    public static boolean palindrome(String message) {   // not efficient as will create new string every recursive call
        int first = 0, last = message.length() - 1;
        if (message.length() <= 1)
            return true;
        if (message.charAt(first) != message.charAt(last))
            return false;
        else {
            return palindrome(message.substring(1, message.length() - 1));
        }
    }

    public static boolean isPalindrome(String s, int first, int last) { // more recommended
        if (s.length() <= 1)
            return true;
        else if (s.charAt(first) != s.charAt(last))
            return false;
        else
            return isPalindrome(s, first + 1, last - 1);
    }
}
