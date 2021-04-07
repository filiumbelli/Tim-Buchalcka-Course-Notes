package com.book.vol2;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        try {
            String content = Files.readString(Paths.get("random.txt"));
        //  String content = new String(Files.readAllBytes(Paths.get("random.txt")), StandardCharsets.UTF_8);

            System.out.println("Count : " + countWordConventional(content,12));
            System.out.println("CountWordLength : " + countWordLength(content,7));
            Stream st = getWords(content,12);
            st.forEach(System.out::println);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static long countWordConventional(String content,long leng){
        List<String> words = Arrays.asList(content.split("\\PL+"));
        int count = 0;
        for(String w : words){
            if(w.length()>leng)count++;
        }
        return count;
    }
    // Stream
    public static long countWordLength(String words,int leng){
        List<String> wordsList = Arrays.asList(words.split("\\PL+"));
        return wordsList.stream()
                .filter(w->w.length()>leng)
                .count();
    }

    public static Stream getWords(String words,int leng){
        List<String> wordLists  = Arrays.asList(words.split("\\PL+"));
        return wordLists.parallelStream()
                .filter(w->w.length()>10)
                .filter(w->w.startsWith("a"))
                ;

    }
}
