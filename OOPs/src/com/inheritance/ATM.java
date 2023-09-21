package com.inheritance;

import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String pin;
    private double balance;

    public BankAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean validatePin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {        //2000
            balance += amount;
            System.out.println("Deposited: $" + amount);//2000
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  //1000 <
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid amount for withdrawal or insufficient funds.");
        }
    }
}

public class ATM {
    public static void main(String[] args) {
        // Create a sample bank account
        BankAccount account = new BankAccount("123456", "1234", 1000.0);

        // Simulate an ATM session
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        String enteredAccountNumber = scanner.nextLine();

        System.out.print("Enter your PIN:");
        String enteredPin = scanner.nextLine();

        if (account.getAccountNumber().equals(enteredAccountNumber) && account.validatePin(enteredPin)) {
            System.out.println("Login successful!");
            displayMenu(account);
        } else {
            System.out.println("Invalid account number or PIN. Please try again.");
        }
    }

    public static void displayMenu(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
