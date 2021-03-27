package Recursive.Recursive_Method_with_Return_Value;

import java.io.File;

public class Directory_Size {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\User\\Videos\\Captures";
        System.out.println("Size of " + fileName + " : " + getSize(new File(fileName)) + " bytes");
    }

    public static long getSize(File file) {
        long size = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();    // All files & subdirectories
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSize(files[i]);  //Recursive call
            }
        }
        else    // base case
            size += file.length();  // size of file, not directory

        return size;
    }
}
