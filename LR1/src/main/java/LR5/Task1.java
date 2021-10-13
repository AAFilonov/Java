package LR5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void doTask() {
        String [] files = new String[]{
                "src/main/resources/thereIsNoSuchFile.txt",
                "src/main/resources/fileWithWrongData.txt",
                "src/main/resources/fileWithFloats.txt",
        };
        Arrays.stream(files).forEach(Task1::processFile);
    }

    public static void processFile(String filename) {
        try {
            var sum = sumValues(filename);
            System.out.printf("Сумма значений в файле %s равна %f \n",filename,sum);
        } catch (IOException e) {
            System.out.println("Ошибка: Не удалось открыть файл " + filename);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Не правильный формат вхолных данных");
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
