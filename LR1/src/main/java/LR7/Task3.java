package LR7;


import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void doTask() {
        System.out.println("Task 7-3");
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(2, 3, 4));

        System.out.println("Set1:" + set1);
        System.out.println("Set2:" + set2);
        System.out.println("Union:" + union(set1, set2));
        System.out.println("Intersection:" + intersection(set1, set2));
        System.out.println("Difference:" + difference(set1, set2));

    }

    static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setUnion = new HashSet();
        setUnion.addAll(set1);
        setUnion.addAll(set2);
        return setUnion;
    }


    static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setIntersection = new HashSet();
        setIntersection.addAll(set1);
        setIntersection.retainAll(set2);
        return setIntersection;
    }

    static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> setDifference = new HashSet();
        setDifference = union(set1, set2);
        setDifference.removeAll(intersection(set1, set2));
        return setDifference;
    }
}
