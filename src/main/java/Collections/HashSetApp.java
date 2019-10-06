package Collections;

import Shapes.Point;
import Shapes.UncomparablePoint;

import java.util.HashSet;

public class HashSetApp {

    public static void main(String[] args) {

        HashSet<UncomparablePoint> uncomparablePoints = new HashSet<>();
        System.out.println(uncomparablePoints.add(new UncomparablePoint(4,6)));
        System.out.println(uncomparablePoints.add(new UncomparablePoint(4,6)));
        System.out.println(uncomparablePoints);
        uncomparablePoints.add(new UncomparablePoint(4,6));
        for (int i = 0; i < 10; i++) {
            uncomparablePoints.add(new UncomparablePoint(i, i+1));
        }
        UncomparablePoint point1 = new UncomparablePoint(12,12);
        System.out.println(uncomparablePoints.add(point1));
        System.out.println(uncomparablePoints.add(point1));
        System.out.println(uncomparablePoints.add(point1));

        System.out.println(uncomparablePoints);
    }

}
