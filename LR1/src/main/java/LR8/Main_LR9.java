package LR8;


import LR5.Main_LR5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
18. How can you eliminate adjacent duplicates from a stream? Would your method
work if the stream was parallel?

1. Verify that asking for the first five long words does not call the filter method
once the fifth long word has been found. Simply log each method call.

2. Measure the difference when counting long words with a parallelStream
instead of a stream. Call System.currentTimeMillis before and after
the call and print the difference. Switch to a larger document (such as War and
Peace) if you have a fast computer
*/


public class Main_LR9 {
    public static void main(String[] args) throws IOException {
    }


     static List<String> getAllWords() throws IOException {
        String filename = "src/main/resources/WarAndPeace.txt";
        Path path = Paths.get(filename);
        List<String> output = Files.lines(path).flatMap(line -> Arrays.stream(line.split(" "))).collect(Collectors.toList());
        return output;
    }


}

