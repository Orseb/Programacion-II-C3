package exercise1.models;

public class Vehicle {
    private String colour;
    private int wheels;

    public Vehicle() {
    }

    public Vehicle(String colour, int wheels) {
        this.colour = colour;
        this.wheels = wheels;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
