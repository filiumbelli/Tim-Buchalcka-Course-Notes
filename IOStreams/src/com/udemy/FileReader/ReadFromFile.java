package com.udemy.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("location.txt"));
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                int num = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String desc = scanner.nextLine();
                System.out.println("Line " + num + ", " + desc);
            }
        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
