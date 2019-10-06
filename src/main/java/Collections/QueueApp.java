package Collections;

import Shapes.Point;
import Shapes.UncomparablePoint;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {
        Queue<Point> points = new PriorityQueue<>();
        points.add(new Point(4,6));
        for (int i = 0; i < 10; i++) {
            points.add(new Point(i, i+1));
        }
        Point point = new Point(12,12);
        points.add(point);



        System.out.println(points);

        while (!points.isEmpty()){
            System.out.println(points.remove());
        }
        Comparator<UncomparablePoint> comparator = new Comparator<UncomparablePoint>() {
            @Override
            public int compare(UncomparablePoint p1, UncomparablePoint p2) {
                return Double.compare(Utils.getThisDistanceToOrigin(p1.getX(),p1.getY()),Utils.getThisDistanceToOrigin(p2.getX(),p2.getY()));
            }
        };
        Queue<UncomparablePoint> uncomparablePoints = new PriorityQueue<>(comparator);
        uncomparablePoints.add(new UncomparablePoint(4,6));
        for (int i = 0; i < 10; i++) {
            uncomparablePoints.add(new UncomparablePoint(i, i+1));
        }
        UncomparablePoint point1 = new UncomparablePoint(12,12);
        uncomparablePoints.add(point1);

        System.out.println(uncomparablePoints);

        while (!uncomparablePoints.isEmpty()){
            System.out.println(uncomparablePoints.remove());
        }

    }

}
