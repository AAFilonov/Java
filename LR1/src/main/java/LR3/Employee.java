package LR3;

public class Employee implements Measurable{
    double salary;
    String name;
    Employee(double salary, String name){
        this.salary = salary;
        this.name = name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
