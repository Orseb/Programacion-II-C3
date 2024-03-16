package exercise2.models;

public class Bird extends Animal {
    private String species;

    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Bird(String name, int age, String gender, String species) {
        super(name, age, gender);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println("The bird sings.");
    }

    @Override
    public void information() {
        printBaseInformation(this);
        System.out.println("species: " + this.getSpecies());
    }
}
