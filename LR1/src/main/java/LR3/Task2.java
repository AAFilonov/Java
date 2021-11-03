package LR3;

import java.util.Arrays;

public class Task2 {
    public static void doTask() {
        Measurable[] employees = new Employee[]{
                new Employee(1000.0,"Вася"),
                new Employee(200.0,"Петя"),
                new Employee(5000.0,"Андрей Васильевич"),
        };
        var employWithMaxSalary = largest(employees);
        System.out.printf("Работник  - %s \n", employWithMaxSalary);
    }


    static String largest(Measurable[] objects) {
        var maxMeasurable = (Employee) Arrays.stream(objects).max((o1, o2) -> o1.getMeasure().compareTo(o2.getMeasure())).orElseThrow(() -> new RuntimeException("Массив пустой"));
        return maxMeasurable.name;
    }
}
