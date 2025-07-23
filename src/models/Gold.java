package models;

public class Gold implements IAccount {
    private double balance;

    public Gold(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " grams of gold. New balance: " + balance + " grams.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " grams of gold. Remaining balance: " + balance + " grams.");
        } else {
            System.out.println("Insufficient balance in gold!");
        }
    }

    @Override
    public void convertCurrency() {
        System.out.println("Gold conversion to currency not implemented yet.");
    }

    public double getBalance() {
        return balance;
    }
}

