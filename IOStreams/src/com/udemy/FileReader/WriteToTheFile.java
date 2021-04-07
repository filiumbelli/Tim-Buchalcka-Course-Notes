package com.udemy.FileReader;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class WriteToTheFile {
    public static void main(String[] args) {
        FileWriter locFile = null;
        try {
            locFile = new FileWriter("location.txt");
            locFile.write("Hello from the other side\n " + "Hahaha \n" + "Interesting");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (locFile != null)
                    locFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
