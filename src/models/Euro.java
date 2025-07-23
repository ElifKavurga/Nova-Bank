package models;

public class Euro implements IAccount {
    private double balance;

    public Euro(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " EUR. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " EUR. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public void convertCurrency() {
        System.out.println("Currency conversion not implemented yet.");
    }

    public double getBalance() {
        return balance;
    }
}

