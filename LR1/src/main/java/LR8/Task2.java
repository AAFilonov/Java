package LR8;


import java.io.IOException;
import java.util.List;

import static LR8.Main_LR9.getAllWords;
/*
1. Verify that asking for the first five long words does not call the filter method
once the fifth long word has been found. Simply log each method call.
*/
public class Task2 {
    public static void main(String[] args) throws IOException {
        List<String> output = getAllWords();
        output.stream()
                .skip(1000)
                .filter(s -> {
                    System.out.println("long word checked");
                    return s.length() >= 8;
                })
                .limit(5)
                .forEach(System.out::println);
    }




}
