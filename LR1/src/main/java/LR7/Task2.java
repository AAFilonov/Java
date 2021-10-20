package LR7;


import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void doTask() {
        System.out.println("Task 7-2");
        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList(
                "string 1",
                "some_other_string",
                "and oNe more"
        ));
        System.out.println("Original array: " + stringArrayList);
        System.out.println("toUpperViaIterator: " + toUpperViaIterator(stringArrayList));
        System.out.println("toUpperViaLoop: " + toUpperViaLoop(stringArrayList));
        System.out.println("toUpperViaReplace: " + toUpperViaReplace(stringArrayList));


    }

    public static ArrayList<String> toUpperViaIterator(ArrayList<String> strings) {
        ArrayList<String> copyOfStrings = new ArrayList<>();
        var it = strings.iterator();
        while (it.hasNext()) {
            copyOfStrings.add(it.next().toUpperCase());
        }
        return copyOfStrings;
    }

    public static ArrayList<String> toUpperViaLoop(ArrayList<String> strings) {
        ArrayList<String> copyOfStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            copyOfStrings.add(string.toUpperCase());
        }
        return copyOfStrings;
    }

    public static ArrayList<String> toUpperViaReplace(ArrayList<String> strings) {
        strings.replaceAll(String::toUpperCase);
        return strings;
    }


}
