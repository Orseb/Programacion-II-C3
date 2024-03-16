package exercise1.models;

public class Bicycle extends Vehicle {
    private String type;

    public Bicycle(String colour, int wheels) {
        super(colour, wheels);
    }

    public Bicycle(String colour, int wheels, String type) {
        super(colour, wheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
