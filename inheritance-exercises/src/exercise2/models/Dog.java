package exercise2.models;

import java.lang.reflect.Field;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Dog(String name, int age, String gender, String breed) {
        super(name, age, gender);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void information() {
        printBaseInformation(this);
        System.out.println("breed: " + this.getBreed());
    }
}
