package LR6;

import java.util.Arrays;
import java.util.function.IntFunction;

/*Consider the method

public static <T> T[] repeat(int n, T obj, IntFunction<T[]>
constr)
in Section 6.6.3, “You Cannot Instantiate Type Variables” (page 221). The call
Arrays.repeat(10, 42, int[]::new) will fail. Why? How can you fix
that? What do you need to do for the other primitive types?
*/
public class Task1 {
    public static void doTask() {
        //repeat(10, 42, int[]::new) - упадет
        repeat(10, 42, Integer[]::new); //Заменить примитивный тип на обертку?
    }

    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n);
        for (int i = 0; i < n; i++) result[i] = obj;
        System.out.println(Arrays.toString(result));
        return result;

    }


}
