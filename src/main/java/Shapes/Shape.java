package Shapes;

import java.io.IOException;

public abstract class Shape implements Colorable{

    public void render(){
        System.out.println("Draw circle");
    }

    protected int colorCode;

    public class InnerPoint{
        private int x;
        private int y;
        private int z;

        public InnerPoint(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static class Color extends GenericColor{
        private final int red;
        private final int green;
        private final int blue;

        @Override
        public String toString() {
            return "Color{" +
                    "red=" + red +
                    ", green=" + green +
                    ", blue=" + blue +
                    '}';
        }

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        static Shape.Color getDescriptiveColor(final Shape.Color color){

            class DescriptiveColor extends Shape.Color{
                DescriptiveColor(){
                    super(color.red,color.green,color.blue);
                }

                @Override
                public String toString() {
                    return "You selected a color with RGB values" + color.red + " " + color.green + " " + color.blue;
                }
            }
            return new DescriptiveColor();
        }
    }

    Shape(){
        System.out.println("Shape constructor");
    }

    public static class ShapeException extends IOException{}

    public abstract double area() throws IOException;
}
