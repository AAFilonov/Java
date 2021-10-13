package LR1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*Write a program that reads an integer angle (which may be positive or negative)
and normalizes it to a value between 0 and 359 degrees. Try it first with the %
operator, then with floorMod*/
public class Task2 {

    static BufferedReader reader;


    public static void doTask() throws IOException {
        reader = new BufferedReader(
                new InputStreamReader(System.in));


        System.out.println("Input integer:");
        int angle = Integer.parseInt(reader.readLine());

        int angle_in_degrees_A = normalize_A(angle);
        int angle_in_degrees_B = normalize_B(angle);

        System.out.printf("Angle normalized with mod :  %d\n", angle_in_degrees_A);
        System.out.printf("Angle normalized with floorMod :  %d\n", angle_in_degrees_B);

    }

    private static int normalize_A(int angle) {
        return angle % 360;
    }

    private static int normalize_B(int angle) {
        return Math.floorMod(angle, 360);
    }


}
