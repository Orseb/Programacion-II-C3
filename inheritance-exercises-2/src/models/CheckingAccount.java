package models;

public class CheckingAccount extends Account{

    protected float overdraft;

    public CheckingAccount(float balance, float annualRate, float monthlyCommission) {
        super(balance, annualRate, monthlyCommission);
        this.overdraft = 0;
    }

    @Override
    public void withdraw(float withdrawal) {
        if (withdrawal > balance) {
            overdraft += withdrawal - balance;
            balance = 0;
            withdrawalsNumber ++;
        } else {
            super.withdraw(withdrawal);
        }
    }

    @Override
    public void deposit(float depositAmount) {
        if (overdraft > 0) {
            if (depositAmount <= overdraft) {
                System.out.println("El sobregiro de tu cuenta pasa de $" + overdraft + " a $" + (overdraft-depositAmount));
                overdraft -= depositAmount;
            } else {
                super.deposit((depositAmount-overdraft));
                System.out.println("El sobregiro de tu cuenta pasa de $" + overdraft + " a $0");
                overdraft = 0;
            }
        } else {
            super.deposit(depositAmount);
        }
    }

    @Override
    public void calculateMonthlyStatement() {
        super.calculateMonthlyStatement();
    }

    @Override
    public void printAttributes() {
        System.out.println("Saldo de la cuenta: " + balance);
        System.out.println("Sobregiro de la cuenta: " + overdraft);
        System.out.println("Comision mensual: " + monthlyCommission);
        System.out.println("Transacciones realizadas: " + (withdrawalsNumber + consignmentsNumber));
    }
}
