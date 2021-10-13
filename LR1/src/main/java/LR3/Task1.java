package LR3;

/*2. Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the
employee with the largest salary. Why do you need a cast?*/

public class Task1 {
    public static void doTask() {
    Measurable[] employees = new Employee[]{
            new Employee(1000.0,"Вася"),
            new Employee(200.0,"Петя"),
            new Employee(5000.0,"Андрей Васильевич"),
    };
     var averageSalary =  Measurable.average(employees);
     System.out.printf("Средняя зарплата работников  равна %f \n",averageSalary);
    }
}
