package com.Lab_Tuto.Lab_from_snr.Lab_1;

import java.io.*;

public class BinaryFile implements FileIO {
    @Override
    public void writeFile() {
        try (ObjectOutputStream writeBinary = new ObjectOutputStream(new FileOutputStream("Binary File.txt"))) {
            writeBinary.writeUTF("write Binary file");
            writeBinary.writeUTF("read binary file");
        } catch (IOException e) {
            System.out.println("Unable to write binary file");
        }
    }

    @Override
    public void readFile() {
        try (ObjectInputStream readBinary = new ObjectInputStream(new FileInputStream("Binary File.txt"))) {
            try {
                while (true) {
                    System.out.println(readBinary.readUTF());
                    System.out.println(readBinary.readUTF());
                }
            } catch (EOFException e) {}
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }

    }
}
