package Exception_Handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class finally_block {

    public static void main(String[] args) {
        // will close the file whether the exception threw
        try (PrintWriter write = new PrintWriter(new FileOutputStream("Hello.txt"))) {
            write.print("Hello");
            write.close();
        } catch (IOException e) {
            System.out.println("File output problem");
        }
    }
}
