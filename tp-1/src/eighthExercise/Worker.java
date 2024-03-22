package eighthExercise;

public class Worker extends Employee {
    private String area;

    public Worker(String name, int age, float salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is producing in the " + area + " area!");
    }

    @Override
    public void showInformation() {
        System.out.println("Information about the worker:");
        super.showInformation();
        System.out.println("Area: " + area);
    }
}
