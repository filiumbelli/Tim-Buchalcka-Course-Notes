package com.book.vol2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapFilterMap {
    public static void main(String[] args) {

        try {
            String str = Files.readString(Paths.get("another.txt"));
            List<String> words = Arrays.asList(str.split("\\PL"));
//            Stream<String> firstLetters = words.stream().map(w -> w.substring(0, 1));
            Stream<String> lowerCase = words.stream().map(String::toLowerCase);

            // generate 100 double
            Stream<Double> hundredDouble = Stream.generate(Math::random).limit(100);
            Stream<String> firstElementPassed = Stream.of(str.split("\\PL+")).skip(1);
//            Stream<String> concatinated = Stream.concat(firstLetters,lowerCase);
//            concatinated.forEach(System.out::println);

            // distinct
            Stream<String> cleared = words.stream().distinct();
//            cleared.forEach(System.out::println);


            // sorting
            Stream <String> longestFirst = words.stream().sorted(Comparator.comparing(String::length).reversed());
//            longestFirst.forEach(System.out::println);

            String[]results = lowerCase.toArray(String[]::new);
            System.out.println(Arrays.toString(results));

            List<String> resultsList = lowerCase.collect(Collectors.toList());
            Set<String> resultsSet = lowerCase.collect(Collectors.toSet());


        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }


}
