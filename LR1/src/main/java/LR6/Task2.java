package LR6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntFunction;

/*
19. Consider the method
public static <T> ArrayList<T> repeat(int n, T obj)
in Section 6.6.3, “You Cannot Instantiate Type Variables” (page 221). This
method had no trouble constructing an ArrayList<T> which contains an array
of T values. Can you produce a T[] array from that array list without using a
Class value or a constructor reference? If not, why not?
*/
public class Task2 {
    public static void doTask() {
      /*var stringArrayList =   repeat(10, "sff");
        System.out.println(Arrays.toString(stringArrayList));*/

    }

    public static <T> T[] repeat(int n, T obj){
        ArrayList<T> result = new ArrayList<>(); // OK
        for (int i = 0; i < n; i++) result.add(obj);
        return (T[])result.toArray(); //кинет  java.lang.ClassCastException
        //из за стирания типов в рантайме, приветси Object  к T невозможно,
        // тк конкретный тип связанный с T неизвестен
    };


}
