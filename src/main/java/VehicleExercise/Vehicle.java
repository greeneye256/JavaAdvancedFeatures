package VehicleExercise;

public class Vehicle {

    protected int currentSpeed;

    public static class VehicleCrashException extends RuntimeException{
        VehicleCrashException() {
            super("Maximum speed exceded!");
        }
    }



    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void increaseSpeed(){
        currentSpeed++;
        if (this.currentSpeed>maxSpeed){
            throw new VehicleCrashException();
        }

    }

    public void setSpeed(int speed) {
        if (speed>maxSpeed){
            throw new VehicleCrashException();
        }
        this.currentSpeed = speed;
    }

    private int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }



    public int getMaxSpeed() {
        return maxSpeed;
    }
}
