package LR6;


import java.io.IOException;

/*
Consider the method

public static <T> T[] repeat(int n, T obj, IntFunction<T[]>
constr)
in Section 6.6.3, “You Cannot Instantiate Type Variables” (page 221). The call
Arrays.repeat(10, 42, int[]::new) will fail. Why? How can you fix
that? What do you need to do for the other primitive types?


19. Consider the method
public static <T> ArrayList<T> repeat(int n, T obj)
in Section 6.6.3, “You Cannot Instantiate Type Variables” (page 221). This
method had no trouble constructing an ArrayList<T> which contains an array
of T values. Can you produce a T[] array from that array list without using a
Class value or a constructor reference? If not, why not?WOW! eBook


20. Implement the method
Click here to view code image
@SafeVarargs public static final <T> T[] repeat(int n,  T...
objs)Return an array with n copies of the given objects. Note that no Class value or
constructor reference is required since you can reflectively increase objs.*/


public class Main_LR6 {
    public static void main(String[] args) throws IOException {
       Task1.doTask();
       Task2.doTask();
       Task3.doTask();
    }
}

