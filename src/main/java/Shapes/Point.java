package Shapes;

import static Collections.Utils.getThisDistanceToOrigin;

public class Point implements Comparable{

    private double x;
    private double y;

    Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Point)) return false;
        Point otherPoint = (Point) other;
        return (Double.compare(this.x, otherPoint.getX()) == 0) && (Double.compare(this.y, otherPoint.getY()) == 0);
    }

    @Override
    public int compareTo(Object other) {
        double thisDistanceToOrigin = getThisDistanceToOrigin(x, y);
        Point otherPoint = (Point) other;
        double otherDistanceToOrigin = getThisDistanceToOrigin(otherPoint.getX(), otherPoint.getY());
        return Double.compare(thisDistanceToOrigin, otherDistanceToOrigin);
    }
}
