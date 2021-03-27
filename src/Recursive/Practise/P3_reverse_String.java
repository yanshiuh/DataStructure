package Recursive.Practise;

public class P3_reverse_String {

    public static void main(String[] args) {
        // http://faculty.salina.k-state.edu/tmertz/Java/322recursion/recursionprogrammingexercises.pdf

        System.out.println(reverse("keeys"));
    }

    public static String reverse(String s) {
        if (s.length() == 1)
            return s;
        else
            return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }
}
