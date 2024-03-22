package ninthExercise;

public class NinthExercise {
    public static void ninthExercise() {

        System.out.println("====== CALCULATING CIRCLE ======");
        Circle circle = new Circle(5);
        System.out.println("Circle's area: " + circle.calculateArea());
        System.out.println("Circle's perimeter: " + circle.calculatePerimeter());

        System.out.println("\n====== CALCULATING RECTANGLE ======");
        Rectangle rectangle = new Rectangle(8, 16);
        System.out.println("Rectangle's area: " + rectangle.calculateArea());
        System.out.println("Rectangle's perimeter: " + rectangle.calculatePerimeter());
    }
}
