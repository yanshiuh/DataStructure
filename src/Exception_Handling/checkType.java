package Exception_Handling;

import java.util.Scanner;

public class checkType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Integer: ");
        String str = sc.nextLine();
        if (isInteger(str))
            System.out.println("Integer");
        else
            System.out.println("Not an integer");
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
