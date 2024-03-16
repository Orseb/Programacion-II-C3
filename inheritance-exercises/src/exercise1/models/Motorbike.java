package exercise1.models;

public class Motorbike extends Bicycle {
    private int speed;
    private int cylinders;

    public Motorbike(String colour, int wheels, String type) {
        super(colour, wheels, type);
    }

    public Motorbike(String colour, int wheels, String type, int speed, int cylinders) {
        super(colour, wheels, type);
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
