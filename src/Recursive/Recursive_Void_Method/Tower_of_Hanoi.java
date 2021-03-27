package Recursive.Recursive_Void_Method;

public class Tower_of_Hanoi {

    public static void main(String[] args) {
        int n = 4;
        System.out.println("The moves for 4 disks are:");
        moveDisks(n, 'A','B','C');
    }

    public static void moveDisks(int n, char from, char to, char temp) {
        if (n == 1)
            System.out.println("Move disk " + n + " from " + from + " to " + to);
        else {
            moveDisks(n - 1, from, temp, to);
            System.out.println("Move disk " + n + " from " + from + " to " + to);
            moveDisks(n -1, temp, to, from);
        }
    }
}
