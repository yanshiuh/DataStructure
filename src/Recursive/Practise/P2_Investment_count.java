package Recursive.Practise;

public class P2_Investment_count {

    public static void main(String[] args) {
        // http://faculty.salina.k-state.edu/tmertz/Java/322recursion/recursionprogrammingexercises.pdf

        System.out.printf("%.2f", cd(0,1000,5,12));
    }

    public static double cd(int n, double deposit, double apr, int period) {
        if (n == 0)
            return deposit;
        else {
            return (1 + (apr / 100 / 12 )) * (n - 1) * 1000;
        }
    }
}
