package Collections;

import Shapes.Point;
import Shapes.UncomparablePoint;

import java.util.HashMap;
import java.util.Map;

public class MapApp {

    public static void main(String[] args) {

        Map<UncomparablePoint, String> descriptionByPoint = new HashMap<>();

        UncomparablePoint p1 = new UncomparablePoint(1,2);
        UncomparablePoint p2 = new UncomparablePoint(5,100);
        UncomparablePoint p3 = new UncomparablePoint(7,9);
        UncomparablePoint p4 = new UncomparablePoint(7,9);

        descriptionByPoint.put(p1, "punctul1");
        descriptionByPoint.put(p2, "punctul2");
        descriptionByPoint.put(p3, "punctul3");
        descriptionByPoint.put(p4, "punctul4");

        System.out.println(descriptionByPoint);

    }

}
