package LR6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

/*
20. Implement the method

@SafeVarargs
public static final <T> T[] repeat(int n,  T... objs)
Return an array with n copies of the given objects. Note that no Class value or
constructor reference is required since you can reflectively increase objs.*/
public class Task3 {
    private final static Logger log = LogManager.getLogger(Task1.class);
    public static void doTask() {

        var array = repeat(10, 1, 2, 3);
        log.info(Arrays.toString(array));
    }

    @SafeVarargs
    public static <T> T[] repeat(int n, T... objs) {
        if (n <= objs.length)
            return objs;
        else {
            T[] result = (T[]) java.lang.reflect.Array.newInstance
                    (objs.getClass().getComponentType(), n);

            return fillArray(n, objs, result);

        }


    }

    public static <T> T[] fillArray(int n, T[] source, T[] destination) {
        int i =-1;
        while (i < n) {
            for (T t : source) {
                i++;
                if (i >= n) return destination;
                destination[i] = t;

            }

        }
    return destination;

    }

}
