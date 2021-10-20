package LR4;


import LR4.geometry.LabeledPoint;
import LR4.geometry.Point;

import java.io.IOException;

/*
Define a class Point with a constructor public Point(double x,
double y) and accessor methods getX, getY. Define a subclassWOW! eBook
www.wowebook.org
LabeledPoint with a constructor public LabeledPoint(String
label, double x, double y) and an accessor method getLabel.
2. Define toString, equals, and hashCode methods for the classes of the
preceding exercise.
3. Make the instance variables x and y of the Point class in Exercise 1
protected. Show that the LabeledPoint class can access these variables

only in LabeledPoint instances
*/

public class Main_LR4 {
    public static void main(String[] args) throws IOException {
        Point p = new Point(1, 1);
        Point p2 = new LabeledPoint("Точка 1.1", 1, 1);
    }
}

