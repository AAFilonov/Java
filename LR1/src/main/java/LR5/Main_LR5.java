package LR5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        String[] files = new String[]{
                "src/main/resources/thereIsNoSuchFile.txt",
                "src/main/resources/fileWithWrongData.txt",
                "src/main/resources/fileWithFloats.txt",
        };
        Arrays.stream(files).forEach(Main_LR5::processFile);
    }

    public static void processFile(String filename) {
        try {
            var sum = sumValues(filename);
            System.out.printf("Сумма значений в файле %s равна %f \n", filename, sum);
        } catch (IOException e) {
            System.out.println("Ошибка: Не удалось открыть файл " + filename);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Не правильный формат входных данных");
        } catch (Exception e) {
            System.out.println("Ошибка:" + e.getMessage());
        }
    }


    public static ArrayList<Double> readValues(String filename) throws IOException, NumberFormatException {
        Path path = Paths.get(filename);
        List<Double> output = Files.lines(path).map(Double::valueOf).collect(Collectors.toList());
        return new ArrayList<Double>(output);
    }

    public static Double sumValues(String filename) throws Exception {
        var values = readValues(filename);
        return values.stream().reduce(Double::sum).orElseThrow(() -> new Exception("Неизвестная ошибка при суммировании"));

    }
}

