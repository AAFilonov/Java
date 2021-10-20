package LR2;


import java.io.IOException;

/*
 5. Implement an immutable class Point that describes a point in the plane. Provide
a constructor to set it to a specific point, a no-arg constructor to set it to the origin,

and methods getX, getY, translate, and scale. The translate method
moves the point by a given amount in x- and y-direction. The scale method
scales both coordinates by a given factor. Implement these methods so that they
return new points with the results. For example,
Click here to view code image
Point p = new Point(3, 4).translate(1, 3).scale(0.5);
should set p to a point with coordinates (2, 3.5).
6. Repeat the preceding exercise, but now make translate and scale into
mutators.
7. Add javadoc comments to both versions of the Point class from the
preceding exercises.
 */
public class Main_LR2 {
    public static void main(String[] args) throws IOException {
        ImmutablePoint p = new ImmutablePoint(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);

        MutablePoint p2 = new MutablePoint(3, 4);
        p2.translate(1, 3);
        p2.scale(0.5);
        System.out.println(p2);

    }
}

