package Shapes;

import java.util.Objects;

public class UncomparablePoint {

    private final double x;
    private final double y;

    public UncomparablePoint(double x, double y) {
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
        return "UncomparablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UncomparablePoint that = (UncomparablePoint) o;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
