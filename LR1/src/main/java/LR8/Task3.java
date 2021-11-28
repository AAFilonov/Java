package LR8;


import java.io.IOException;
import java.util.List;

/*
2. Measure the difference when counting long words with a parallelStream
instead of a stream. Call System.currentTimeMillis before and after
the call and print the difference. Switch to a larger document (such as War and
Peace) if you have a fast computer
*/
public class Task3 {
    public static void main(String[] args)  throws IOException {
        List<String> output = Main_LR9.getAllWords();

        Long sequential_time_start = System.currentTimeMillis();
        output.stream()
                .filter(s -> s.length() >= 8)
                .limit(1000)
                .count();

        Long sequential_time_end = System.currentTimeMillis();
        System.out.println("Sequential time: " + (sequential_time_end - sequential_time_start));

        Long parallel_time_start = System.currentTimeMillis();
        output.parallelStream()
                .filter(s -> s.length() >= 8)
                .limit(1000)
                .count();
        Long parallel_time_end = System.currentTimeMillis();
        System.out.println("Parallel time: " + (parallel_time_end - parallel_time_start));
    }




}
