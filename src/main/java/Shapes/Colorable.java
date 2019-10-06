package Shapes;

public interface Colorable {

    int DEFAULT_COLOR_CODE = 0;

    static void describeBehaviour(){
        System.out.println("This is colorable");
    }

    default void printDefaultColor(){
        System.out.println(DEFAULT_COLOR_CODE);
    }

    class GenericColor{

    }

    abstract void render();


}
