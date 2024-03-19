package models;

public class Officer extends Operator {

    protected String officerArea;

    public Officer(String name, String operatorArea, String officerArea) {
        super(name, operatorArea);
        this.officerArea = officerArea;
    }

    public String getOfficerArea() {
        return officerArea;
    }

    public void setOfficerArea(String officerArea) {
        this.officerArea = officerArea;
    }

    @Override
    public String toString() {
        return super.toString() + ", Officer area: " + this.getOfficerArea();
    }
}
