package LR8;


import java.util.List;
import java.util.stream.Collectors;
/*
18. How can you eliminate adjacent duplicates from a stream? Would your method
work if the stream was parallel?
*/

public class Task1 {
    public static void main(String[] args) {
        List<Integer> duplicates = List.of(1, 1, 3, 2, 2, 1, 2, 3, 4, 2, 2, 4);
        duplicates.stream()

                .forEach(integer -> System.out.println(integer));
    }


}
