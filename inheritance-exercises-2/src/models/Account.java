package models;

public class Account {

    protected float balance;
    protected int consignmentsNumber;
    protected int withdrawalsNumber;
    protected float annualRate;
    protected float monthlyCommission;

    public Account(float balance, float annualRate, float monthlyCommission) {
        this.balance = balance;
        this.annualRate = annualRate;
        this.monthlyCommission = monthlyCommission;
        this.consignmentsNumber = 0;
        this.withdrawalsNumber = 0;
    }

    public void deposit(float depositAmount) {
        System.out.println("El sueldo de tu cuenta pasa de $" + balance + " a $" + (balance+ depositAmount));
        balance += depositAmount;
        consignmentsNumber ++;
    }

    public void withdraw(float withdrawal) {
        if (withdrawal > balance) {
            System.out.println("No puedes retirar mas saldo del que tienes disponible.");
        } else {
            System.out.println("El sueldo de tu cuenta pasa de $" + balance + " a $" + (balance-withdrawal));
            balance -= withdrawal;
            withdrawalsNumber ++;
        }
    }

    public void calculateMonthlyInterest() {
        float monthlyInterest = balance * (annualRate / 12) / 100;
        balance += monthlyInterest;
    }

    public void calculateMonthlyStatement() {
        balance -= monthlyCommission;
        calculateMonthlyInterest();
    }

    public void printAttributes() {
        System.out.println("Saldo de la cuenta: " + balance);
        System.out.println("Numero de consignaciones: " + consignmentsNumber);
        System.out.println("Numero de retiros: " + withdrawalsNumber);
        System.out.println("Tasa anual (%): " + annualRate);
        System.out.println("Comision mensual: " + monthlyCommission);
    }
}
