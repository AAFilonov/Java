package LR5;


import java.io.IOException;

/*
1. Write a method public ArrayList<Double> readValues(String
filename) throws ... that reads a file containing floating-point numbers.
Throw appropriate exceptions if the file could not be opened or if some of the
inputs are not floating-point numbers.
2. Write a method public double sumOfValues(String filename)
throws ... that calls the preceding method and returns the sum of the values
in the file. Propagate any exceptions to the caller.
3. Write a program that calls the preceding method and prints the result. Catch the
exceptions and provide feedback to the user about any error conditions.
4. Repeat the preceding exercise, but don't use exceptions. Instead, have
readValues and sumOfValues return error codes of some kind.
*/

public class Main_LR5 {
    public static void main(String[] args) throws IOException {
        Task1.doTask();
    }
}

