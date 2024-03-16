package exercise1.models;

public class Van extends Car {
    private float load;

    public Van(String colour, int wheels, int speed, int cylinders) {
        super(colour, wheels, speed, cylinders);
    }

    public Van(String colour, int wheels, int speed, int cylinders, float load) {
        super(colour, wheels, speed, cylinders);
        this.load = load;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }
}
