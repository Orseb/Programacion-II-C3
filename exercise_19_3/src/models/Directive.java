package models;

public class Directive extends Employee {

    protected String directiveArea;

    public Directive(String name, String directiveArea) {
        super(name);
        this.directiveArea = directiveArea;
    }

    public String getDirectiveArea() {
        return directiveArea;
    }

    public void setDirectiveArea(String directiveArea) {
        this.directiveArea = directiveArea;
    }

    @Override
    public String toString() {
        return super.toString() + ", Directive area: " + this.getDirectiveArea();
    }
}
