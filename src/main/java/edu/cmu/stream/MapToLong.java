package edu.cmu.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class MapToLong {


    public static void main(String[] args) {


        //mapToLong 是一个 Intermediate Operation

        File file = new File("/Users/dyq/idea_workspace/javaSummary/src/main/java/edu/cmu/stream/mapToLongTest.txt");

        System.out.println(countKeyWords(file));

    }

    public static long countKeyWords(File file){
        String[] keywordsString = {"abstract","wrong","true"};
        Set<String> keywordSet =   new HashSet<>(Arrays.asList(keywordsString));
        try {
            return Files.lines(file.toPath()).parallel().mapToLong(line-> Stream.of(line.split("[\\s++]")).filter(word -> keywordSet.contains(word)).count()).sum();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;

    }
}
