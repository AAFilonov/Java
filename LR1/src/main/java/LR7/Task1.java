package LR7;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;


public class Task1 {
    public static void doTask() {
        System.out.println("Task 7-1");
        System.out.println("HashSet:"+allPrimeNumbersInHashSet(100));
        System.out.println("BitSet:"+allPrimeNumbersInBitSet(100));
    }

    public static Set<Integer> allPrimeNumbersInHashSet(Integer n) {
        Set<Integer> primeNumbers = new HashSet<>();
        for (int i = 1; i < n; i++) {
            primeNumbers.add(i);
        }

        for (int t = 2; t * t < n; t++)
            for (int i = 0; true; i++) {
                var s = t * (t + i);
                if (s > n) break;
                primeNumbers.remove(s);
            }

        return primeNumbers;
    }


    public static BitSet allPrimeNumbersInBitSet(Integer n) {
        BitSet primeNumbers = new BitSet();
        for (int i = 1; i < n; i++) {
            primeNumbers.set(i, true);

        }
        for (int t = 2; t * t < n; t++)
            for (int i = 0; true; i++) {
                var s = t * (t + i);
                if (s > n) break;
                primeNumbers.set(s, false);
            }


        return primeNumbers;
    }


}
