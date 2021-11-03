package LR3;

import java.util.Arrays;

public interface Measurable {

    Double getMeasure();

    static double average(Measurable[] objects) {
        var sumOfAverages = Arrays.stream(objects)
                .map(Measurable::getMeasure)
                .reduce(Double::sum)
                .orElseThrow();
        return sumOfAverages / objects.length;
    }

    ;



}
