package Collections;

import Shapes.Point;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {

    public static void main(String[] args) {
        Set<Point> points = new TreeSet<>();

        points.add(new Point(4,6));
        points.add(new Point(256,256));
        for (int i = 0; i < 10; i++) {
            points.add(new Point(i, i+1));
        }
        Point point = new Point(12,12);
        Point point4 = new Point(0,0);
        points.add(point4);

        points.add(point);
        points.add(point);

        System.out.println(points);

    }

}
