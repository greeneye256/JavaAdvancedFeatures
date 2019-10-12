package Shapes;

import VehicleExercise.Car;

import java.io.Serializable;

public class Circle extends Shape implements Colorable, Serializable {
    private transient Point center;
    private double radius;



    public Circle(int x, int y, double radius) {
        System.out.println("Circle Constructor");
        this.radius = radius;
        this.center = new Point(x,y);
    }
    public Circle(int radius){
        this.radius = radius;
        this.center = new Point(0,0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void fillColor(){
        System.out.println(this.colorCode);
    }

    @Override
    public double area() throws ShapeException {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
