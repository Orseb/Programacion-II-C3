package eighthExercise;

public class EighthExercise {
    public static void eighthExercise() {

        System.out.println("====== MANAGER ======");
        Manager manager = new Manager("Lucas", 40, 6000, "Human Resources");
        manager.showInformation();
        manager.work();

        System.out.println("\n====== WORKER ======");
        Worker worker = new Worker("Daniel", 25, 3000, "Shipments");
        worker.showInformation();
        worker.work();
    }
}