package LR3;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void doTask() {
        Measurable[] employees = new Employee[]{
                new Employee(1000.0,"Вася"),
                new Employee(200.0,"Петя"),
                new Employee(5000.0,"Андрей Васильевич"),
        };
        var largestSalary =  Measurable.largest(employees);
        System.out.printf("Максимальная зарплата работников  равна %f \n",largestSalary);

    }
}
