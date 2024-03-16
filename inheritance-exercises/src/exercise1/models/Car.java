package exercise1.models;

public class Car extends Vehicle {
    private int speed;
    private int cylinders;

    public Car(String colour, int wheels) {
        super(colour, wheels);
    }

    public Car(String colour, int wheels, int speed, int cylinders) {
        super(colour, wheels);
        this.speed = speed;
        this.cylinders = cylinders;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
