import models.CheckingAccount;
import models.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        System.out.println("====== CAJA DE AHORROS ======");
        SavingsAccount savingsAccount = new SavingsAccount(8000, 5, 500);
        savingsAccount.printAttributes();
        savingsAccount.withdraw(2000);
        savingsAccount.deposit(3000);
        savingsAccount.withdraw(1000);
        savingsAccount.calculateMonthlyStatement();
        savingsAccount.printAttributes();

        System.out.println("\n====== CUENTA CORRIENTE ======");
        CheckingAccount checkingAccount = new CheckingAccount(5000, 2, 1000);
        checkingAccount.printAttributes();
        checkingAccount.withdraw(6000);
        checkingAccount.deposit(8000);
        checkingAccount.calculateMonthlyStatement();
        checkingAccount.printAttributes();
    }
}