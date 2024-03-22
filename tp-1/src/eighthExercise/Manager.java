package eighthExercise;

public class Manager extends Employee {

    private String department;

    public Manager(String name, int age, float salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is organizing activities in the " + department + " department!");
    }

    @Override
    public void showInformation() {
        System.out.println("Information about the manager:");
        super.showInformation();
        System.out.println("Department: " + department);
    }
}

