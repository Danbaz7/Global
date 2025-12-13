/*
 * Program name: DanielObazeeProj12.java
 * Author: Daniel Obazee
 * Date created: October 19, 2025
 * Purpose: Implements exception handling in a bank account hierarchy using custom exceptions.
 */
package danielobazeeproj12;

/**
 *
 * @author danielobazee
 */
//Custom exception for illegal transaction amounts

class IllegalAmountException extends Exception {
    public IllegalAmountException(String message) {
        super(message);
    }
}

// Custom exception for insufficient funds
class NoSufficientFundsException extends Exception {
    public NoSufficientFundsException(String message) {
        super(message);
    }
}

// Base class representing a generic bank account
class Account {
    private int id;           // Unique account ID
    private double balance;   // Current account balance

    // Default constructor
    public Account() {
        this.id = 0;
        this.balance = 0.0;
    }

    // Constructor with parameters
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // Setters and getters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Deposit method with exception handling
    public void deposit(double amount) throws IllegalAmountException {
        if (amount <= 0) {
            throw new IllegalAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    // Withdraw method to be overridden by subclasses
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException {
        // No implementation in base class
    }

    // String representation of account
    public String toString() {
        return "Account ID: " + id + ", Balance: $" + String.format("%.2f", balance);
    }
}

// Subclass representing a checking account
class CheckingAccount extends Account {

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    // Withdraw method with checking account rules
    @Override
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException {
        if (amount <= 0) {
            throw new IllegalAmountException("Withdrawal amount must be positive.");
        }
        if (amount > getBalance()) {
            throw new NoSufficientFundsException("Insufficient funds for withdrawal.");
        }
        setBalance(getBalance() - amount);
    }

    // String representation
    @Override
    public String toString() {
        return "CheckingAccount - " + super.toString();
    }
}

// Subclass representing a savings account
class SavingsAccount extends Account {
    private double interestRate; // Interest rate in decimal form

    public SavingsAccount(int id, double balance, double interestRate) {
        super(id, balance);
        this.interestRate = interestRate;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Withdraw method with savings account rules
    @Override
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException {
        if (amount <= 0) {
            throw new IllegalAmountException("Withdrawal amount must be positive.");
        }
        if ((getBalance() - amount) < 500) {
            throw new NoSufficientFundsException("Cannot withdraw: minimum balance of $500 must be maintained.");
        }
        setBalance(getBalance() - amount);
    }

    // Apply interest to balance
    public void addInterest() {
        setBalance(getBalance() * (1 + interestRate));
    }

    // String representation
    @Override
    public String toString() {
        return "SavingsAccount - " + super.toString() + ", Interest Rate: " + (interestRate * 100) + "%";
    }
}

// Main class to test the account hierarchy with exception handling
public class DanielObazeeProj12 {
    public static void main(String[] args) {
        // Create an array of Account references
        Account[] accounts = new Account[4];

        // Initialize accounts with appropriate types
        accounts[0] = new CheckingAccount(101, 1000.0);
        accounts[1] = new CheckingAccount(102, 500.0);
        accounts[2] = new SavingsAccount(201, 800.0, 0.06);
        accounts[3] = new SavingsAccount(202, 600.0, 0.05);

        // Loop through each account and perform operations
        for (Account acc : accounts) {
            try {
                acc.deposit(200.0);      // Attempt deposit
                acc.withdraw(300.0);     // Attempt withdrawal
            } catch (IllegalAmountException | NoSufficientFundsException e) {
                System.out.println("Transaction error for Account ID " + acc.getId() + ": " + e.getMessage());
            }

            // Print account details
            System.out.println(acc);

            // Apply interest if SavingsAccount
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
                System.out.println("After interest: " + acc);
            }
        }
    }
}