package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            try {
                System.out.print("Enter an integer(0 - 50): ");
                num = sc.nextInt();
                if (num < 0 || num >= 50)
                    throw new Exception("The number is not in range");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Integer: " + num);
    }
}
