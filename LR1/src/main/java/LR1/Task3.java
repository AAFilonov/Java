package LR1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*3. Using only the conditional operator, write a program that reads three integers and
     prints the largest. Repeat with Math.max.*/
public class Task3 {
    static BufferedReader reader;


    public static void doTask() throws IOException {
        reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Input 3 numbers:");
        int value_1 = Integer.parseInt(reader.readLine());
        int value_2 = Integer.parseInt(reader.readLine());
        int value_3 = Integer.parseInt(reader.readLine());


        System.out.printf("Largest by conditions: - %d\n", getLargestByIfs(value_1, value_2, value_3));
        System.out.printf("Largest by Max: - %d\n1", getLargestByMax(value_1, value_2, value_3));
    }

    private static int getLargestByMax(int value_1, int value_2, int value_3) {
        return Math.max(value_1, Math.max(value_2, value_3));
    }

    private static int getLargestByIfs(int value_1, int value_2, int value_3) {
        int largest = value_1;
        if (value_2 > largest)
            largest = value_2;
        if (value_3 > largest)
            largest = value_3;
        return largest;
    }


}
