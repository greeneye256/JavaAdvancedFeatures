package Shapes;

public class App {

    public static void main(String[] args) {

        Circle firstCircle = new Circle(5);
        firstCircle.colorCode = 5;
        //System.out.println(firstCircle.area());
        firstCircle.fillColor();
        Circle circle = new Circle(3,4,2);
        circle.render();

        Shape.Color color = new Shape.Color(132,123,122);
        System.out.println(color.toString());

    }




}
