package LR3;

import java.util.Arrays;

public interface Measurable {

    double getMeasure();

    static double average(Measurable[] objects){
        var sumOfAverages = Arrays.stream(objects)
                .map(obj ->obj.getMeasure())
                .reduce((aDouble, aDouble2) -> aDouble+aDouble2)
                .get();
       return  sumOfAverages/objects.length;
    };

    static double  largest(Measurable[] objects) {
        return   Arrays.stream(objects).map(Measurable::getMeasure).max(Double::compare).get();
    }

}
