import models.*;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Pedro");
        Operator operator = new Operator("Luis", "Operations area");
        Directive directive = new Directive("Roberto", "Direction area");
        Officer officer = new Officer("Sergio", "Operations area", "Office area");
        Technician technician = new Technician("Simon", "Operations area", "Technical area");

        System.out.println(employee.toString());
        System.out.println(operator.toString());
        System.out.println(directive.toString());
        System.out.println(officer.toString());
        System.out.println(technician.toString());
    }
}
