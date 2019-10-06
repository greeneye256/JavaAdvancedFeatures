package Collections;

import Shapes.Point;

import java.util.ArrayList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(4,6));
        for (int i = 0; i < 10; i++) {
            points.add(new Point(i, i+1));
        }
        Point point = new Point(12,12);
        points.add(point);
        System.out.println(points);
        points.remove(new Point(4,6));
        System.out.println(points);
    }

}
