package com.book.vol2;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        try {
            String contents = Files.readString(Paths.get("random.txt"));
            Stream<String> words = Stream.of(contents.split("\\PL+"));
            // split returns a String[] array
            Stream<String> song = Stream.of("gen", "te", "wolly", "tobacco");
            Stream<String> silence = Stream.empty();
            // stream generator
            Stream<String> echos = Stream.generate(() -> "Echo");
            Stream<Double> randomDouble = Stream.generate(Math::random);
            // infinite times of Stream
            Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
//            song.forEach(w-> System.out.println(w));
            System.out.println(words);
            System.out.println(song);
            System.out.println(echos);

            System.out.println(randomDouble);

            Stream<String> words2 = Pattern.compile("\\PL+").splitAsStream(contents);
            System.out.println(words2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
