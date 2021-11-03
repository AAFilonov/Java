package LR1_1;


/*4. Write a program that prints the smallest and largest positive double values.
  Hint: Look up Math.nextUp in the Java API*/
public class Task4 {


    public static void doTask() {
        printMaxDouble();
        printMinDouble();
    }

    private static void printMaxDouble() {

        System.out.println((Math.nextDown(Double.MAX_VALUE)));
    }

    private static void printMinDouble() {

        System.out.println(Math.nextUp(0.0));
    }
}
