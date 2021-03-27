package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                sc.nextLine();
            }
        }
        System.out.println("Integer: " + num);
    }
}
