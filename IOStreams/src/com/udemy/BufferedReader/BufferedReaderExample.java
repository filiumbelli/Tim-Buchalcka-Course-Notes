package com.udemy.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedReaderExample {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("location.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
//                int num = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.next();
//                scanner.skip(scanner.delimiter());
//                String endwords = scanner.nextLine();
//                System.out.println("Line " + num + " Desc: " + description + " Endwords please: " + endwords);


                // String manipulation
                String line = scanner.nextLine();
                String[] sentences = line.split(",");
                System.out.println("Line: "+ sentences[0] + "Description: "+ sentences[1] + "EndWords: " + sentences[2]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
