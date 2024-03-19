package models;

public class Technician extends Operator {

    protected String technicianArea;

    public Technician(String name, String operatorArea, String technicianArea) {
        super(name, operatorArea);
        this.technicianArea = technicianArea;
    }

    public String getTechnicianArea() {
        return technicianArea;
    }

    public void setTechnicianArea(String technicianArea) {
        this.technicianArea = technicianArea;
    }

    @Override
    public String toString() {
        return super.toString() + ", Technician area: " + this.getTechnicianArea();
    }
}
