package exercise2;

import exercise2.models.Bird;
import exercise2.models.Cat;
import exercise2.models.Dog;

public class secondExercise {
    public static void main(String[] args) {
        System.out.println("\nFirst animal:");
        Dog dog = new Dog("Watson", 12, "Male", "German Shepherd");
        dog.makeSound();
        dog.information();

        System.out.println("\nSecond animal:");
        Cat cat = new Cat("Akira", 6, "Female", "Bicolor");
        cat.makeSound();
        cat.information();

        System.out.println("\nThird animal:");
        Bird bird = new Bird("Cornelio", 2, "Female", "Canary");
        bird.makeSound();
        bird.information();
    }
}
