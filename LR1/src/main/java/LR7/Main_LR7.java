package LR7;


import java.io.IOException;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

/*
1. Implement the “Sieve of Erathostenes” algorithm to determine all prime numbers
≤ n. Add all numbers from 2 to n to a set. Then repeatedly find the smallest
element s in the set, and remove s2, s · (s + 1), s · (s + 2), and so on. You are done
when s2 > n. Do this with both a HashSet<Integer> and a BitSet.
2. In an array list of strings, make each string uppercase. Do this with (a) an iterator,
(b) a loop over the index values, and (c) the replaceAll method.
3. How do you compute the union, intersection, and difference of two sets, using just
the methods of the Set interface and without using loops?
*/


public class Main_LR7 {
    public static void main(String[] args) throws IOException {
        Task1.doTask();
        Task2.doTask();
        Task3.doTask();
    }





}

