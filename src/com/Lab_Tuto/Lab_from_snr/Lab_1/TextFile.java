package com.Lab_Tuto.Lab_from_snr.Lab_1;

import java.io.*;
import java.util.Scanner;

public class TextFile implements FileIO {
    @Override
    public void writeFile() {
        // this will help us to automatically close the file
        try (PrintWriter write = new PrintWriter(new FileOutputStream("TextFile.txt"))){
            write.println("Write to text file");
            write.println("Read from text file");
            write.close();
        } catch (IOException e) {
            System.out.println("Unable to write file");
        }
    }

    @Override
    public void readFile() {
        // this will help us to automatically close the file
        try (Scanner read = new Scanner(new FileInputStream("TextFile.txt"))) {
            while (read.hasNextLine()) {
                System.out.println(read.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
