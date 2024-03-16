package exercise2.models;

import java.lang.reflect.Field;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal() {
    }

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void makeSound() {
        System.out.println("This animal makes a generic sound.");
    }

    public void information() {
        System.out.println("Generic information about an animal.");
    }

    public void printBaseInformation(Animal animal) {
        System.out.println("Animal: " + animal.getClass().getSimpleName());
        Field[] fields = animal.getClass().getSuperclass().getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                Object value = field.get(animal);
                System.out.println(field.getName() + ": " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
