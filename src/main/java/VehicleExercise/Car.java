package VehicleExercise;

public class Car extends Vehicle{

    private boolean isConvertible = false;

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    public Car(int maxSpeed, boolean isConvertible){
        super(maxSpeed);
        this.isConvertible = isConvertible;
    }




}
