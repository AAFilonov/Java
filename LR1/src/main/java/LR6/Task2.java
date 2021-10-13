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
Class value or a constructor reference? If not, why not?WOW! eBook
*/
public class Task2 {
    public static void doTask() {
      var stringArrayList =   repeat(10, "sff");
      var  stringArray1  = stringArrayList.toArray(); // будет получен масив object
      var  stringArray2  = (String[])stringArrayList.toArray();//Массив строк через явное приведение
        System.out.println(Arrays.toString(stringArray2));

    }

    public static <T> ArrayList<T> repeat(int n, T obj){
        ArrayList<T> result = new ArrayList<>(); // OK
        for (int i = 0; i < n; i++) result.add(obj);
        return result;
    };


}
