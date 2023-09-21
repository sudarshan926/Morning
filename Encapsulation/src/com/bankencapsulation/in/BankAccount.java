package com.bankencapsulation.in;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(1500.0);
        System.out.println("Current Balance: " + account.getBalance());

        account.deposit(-100.0);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(-50.0);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
