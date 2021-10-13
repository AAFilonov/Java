package LR3;



import java.io.IOException;

/*1.Provide an interface Measurable with a method double getMeasure()
that measures an object in some way. Make Employee implement
Measurable. Provide a method double average(Measurable[]
objects) that computes the average measure. Use it to compute the average
salary of an array of employees.
2. Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the

employee with the largest salary. Why do you need a cast?
3. What are all the supertypes of String? Of Scanner? Of
ImageOutputStream? Note that each type is its own supertype. A class or

interface without declared supertype has supertype Object.*/

public class Main_LR3 {
    public static void main(String[] args) throws IOException {
        Task1.doTask();
        Task2.doTask();
        Task3.doTask();
    }
}

