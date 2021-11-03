package LR3;

public class Employee implements Measurable{
    Double salary;
    String name;
    Employee(double salary, String name){
        this.salary = salary;
        this.name = name;
    }

    @Override
    public Double getMeasure() {
        return salary;
    }
}
