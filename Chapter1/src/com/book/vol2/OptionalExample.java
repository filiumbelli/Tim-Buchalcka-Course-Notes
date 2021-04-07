package com.book.vol2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {
        try {
            String strWords = Files.readString(Paths.get("another.txt"));
            List<String> words = Arrays.asList(strWords.split("\\PL+"));
            //min
            Optional<String> minWord =  words.stream().filter(w->w.startsWith("q")).min(Comparator.comparing(String::length));
            Optional<String> maxWord = words.stream().filter(w->w.startsWith("q")).max(Comparator.comparing(String::length));
            System.out.println(minWord);
            System.out.println(maxWord);
            // first word q
            Optional<String> firstWordQ = words.stream().filter(w->w.startsWith("q")).findFirst();
            System.out.println(firstWordQ);
            // check
            boolean findAllQ = words.stream().parallel().anyMatch(s->s.startsWith("q"));

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
