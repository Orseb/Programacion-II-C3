package models;

public class Operator extends Employee {

    protected String operatorArea;

    public Operator(String name, String operatorArea) {
        super(name);
        this.operatorArea = operatorArea;
    }

    public String getOperatorArea() {
        return operatorArea;
    }

    public void setOperatorArea(String operatorArea) {
        this.operatorArea = operatorArea;
    }

    @Override
    public String toString() {
        return super.toString() + ", Operator area: " + this.getOperatorArea();
    }
}
