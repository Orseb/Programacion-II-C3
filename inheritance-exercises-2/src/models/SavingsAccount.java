package models;

public class SavingsAccount extends Account {
    protected boolean activeAccount;

    public SavingsAccount(float balance, float annualRate, float monthlyCommission) {
        super(balance, annualRate, monthlyCommission);
        this.activeAccount = !(balance < 10000);
    }

    @Override
    public void deposit(float depositAmount) {
        if (activeAccount) {
            super.deposit(depositAmount);
        } else {
            System.out.println("La cuenta no esta activa, el saldo debe ser mayor a $10.000");
            System.out.println("Saldo actual: $" + balance);
        }
    }

    @Override
    public void withdraw(float withdrawal) {
        if (activeAccount) {
            super.withdraw(withdrawal);
        } else {
            System.out.println("La cuenta no esta activa, el saldo debe ser mayor a $10.000");
            System.out.println("Saldo actual: $" + balance);
        }
    }

    @Override
    public void calculateMonthlyStatement() {
        if (withdrawalsNumber > 4) {
            balance -= 1000;
        }
        super.calculateMonthlyStatement();

        if (balance < 10000) {
            activeAccount = false;
        }
    }

    @Override
    public void printAttributes() {
        System.out.println("Saldo de la cuenta: " + balance);
        System.out.println("Comision mensual: " + monthlyCommission);
        System.out.println("Transacciones realizadas: " + (withdrawalsNumber + consignmentsNumber));
    }
}
