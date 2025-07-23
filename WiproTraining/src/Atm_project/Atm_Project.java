package Atm_project;

import java.util.Scanner;

public class Atm_Project {
    private double balance;
    private Scanner scanner;

    public Atm_Project() {
        balance = 1000; // initial balance
        scanner = new Scanner(System.in);
    }

    public void displaymenu() {
        System.out.println("\nATM Menu");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }

    public void checkbalance() {
        System.out.println("Your Balance is $" + balance);
    }

    public void deposit() {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void withdraw() {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Remaining balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public static void main(String args[]) {
        Atm_Project atm = new Atm_Project();
        while (true) {
            atm.displaymenu();
            System.out.print("Enter your choice: ");
            int choice = atm.scanner.nextInt();
            switch (choice) {
                case 1:
                    atm.checkbalance();
                    break;
                case 2:
                    atm.deposit();
                    break;
                case 3:
                    atm.withdraw();
                    break;
                case 4:
                    System.out.println("Thank You for using the ATM. Goodbye!");
                    return; // exit the program
                default:
                    System.out.println("Invalid Choice. Please select a valid option.");
            }
        }
    }
}
