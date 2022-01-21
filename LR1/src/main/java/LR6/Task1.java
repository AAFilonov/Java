package LR6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
    private final static Logger log = LogManager.getLogger(Task1.class);

    public static void doTask() {
        //repeat(10, 42, int[]::new) - упадет
        var result = repeat(10, 42, Integer[]::new); //Заменить примитивный тип на обертку?
        log.info(Arrays.toString(result));
    }

    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n);
        for (int i = 0; i < n; i++) result[i] = obj;
        log.info(Arrays.toString(result));
        return result;

    }


}
