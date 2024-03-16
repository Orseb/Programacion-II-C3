package exercise1;

import exercise1.models.*;

import java.lang.reflect.Field;

public class firstExercise {
    public static void main(String[] args) {

        Car car = new Car("Red", 4, 180, 1600);
        Bicycle bicycle = new Bicycle("Black", 2, "Urban");
        Van van = new Van("White", 4, 140, 1500, 400);
        Motorbike motorbike = new Motorbike("Yellow", 2, "Sporty", 240, 250);

        Vehicle[] vehicles = {car, bicycle, van, motorbike};

        System.out.println("-------------------------------------");

        System.out.println("Categorizing without passing wheels parameter:");
        categorize(vehicles);

        System.out.println("-------------------------------------");

        System.out.println("Categorizing with 0 wheels:");
        categorize(vehicles, 0);

        System.out.println("-------------------------------------");

        System.out.println("Categorizing with 2 wheels:");
        categorize(vehicles, 2);

        System.out.println("-------------------------------------");

        System.out.println("Categorizing with 4 wheels:");
        categorize(vehicles, 4);

    }

    public static void categorize(Vehicle[] vehicles){
        for (Vehicle vehicle : vehicles){
            printVehicleInfo(vehicle);
        }
    }

    public static void categorize(Vehicle[] vehicles, int wheels){
        int vehiclesAmount = 0;
        for (Vehicle vehicle : vehicles){
            if (vehicle.getWheels() == wheels){
                vehiclesAmount ++;
                printVehicleInfo(vehicle);
            }
        }
        System.out.println("There are " + vehiclesAmount + " vehicles with " + wheels + " wheels.");
    }

    public static void printVehicleInfo(Vehicle vehicle) {
        System.out.println("Vehicle: " + vehicle.getClass().getSimpleName());
        Field[] fields = vehicle.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object value = field.get(vehicle);
                System.out.println(field.getName() + ": " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}
