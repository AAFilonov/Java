package LR6;

import java.util.Arrays;

/*
20. Implement the method

@SafeVarargs
public static final <T> T[] repeat(int n,  T... objs)
Return an array with n copies of the given objects. Note that no Class value or
constructor reference is required since you can reflectively increase objs.*/
public class Task3 {
    public static void doTask() {

        var array = repeat(10, 1, 2, 3);
        System.out.println(Arrays.toString(array));
    }

    @SafeVarargs
    public static final <T> T[] repeat(int n, T... objs) {
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
            for (int j = 0; j < source.length; j++ ) {
                i++;
                if(i>=n)return destination;
                destination[i] = source[j];

            }

        }
    return destination;

    }

}
