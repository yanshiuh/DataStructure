package Recursive.Practise;

public class P1 {

    public static void main(String[] args) {
        // http://faculty.salina.k-state.edu/tmertz/Java/322recursion/recursionprogrammingexercises.pdf

        // For example, the long value 1234567890 is returned as the string 1,234,567,890

        System.out.println(formatDec(1234567890));
    }

    public static String formatDec(long x) {
        if (x < 1000)
            return String.valueOf(x);  // valueof method convert everything to String
        else
            return formatDec(x / 1000) + "," + String.valueOf(x % 1000);
    }
}
