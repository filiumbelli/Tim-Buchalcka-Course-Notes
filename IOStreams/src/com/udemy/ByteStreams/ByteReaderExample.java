package com.udemy.ByteStreams;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class ByteReaderExample {
    private static LinkedHashMap<Integer, String> locations = new LinkedHashMap<Integer, String>();

    public static void main(String[] args) {
        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("location.dat")))) {
            locations.forEach((k, v) -> {
                try {
                    locFile.writeInt(k);
                    locFile.writeUTF(v);
                    System.out.println("Key : " + k);
                    System.out.println("Value: " + v);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.getMessage();
        }
    }

    static {

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("location.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                int num = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String other = scanner.nextLine();
                locations.put(num, other);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
