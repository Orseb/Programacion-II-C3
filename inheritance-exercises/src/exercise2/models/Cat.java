package exercise2.models;

public class Cat extends Animal {
    private String fur;

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Cat(String name, int age, String gender, String fur) {
        super(name, age, gender);
        this.fur = fur;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }

    @Override
    public void information() {
        printBaseInformation(this);
        System.out.println("fur: " + this.getFur());
    }
}
