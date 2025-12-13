/* * Program name: DanielObazeeMain.java
 * Author: Daniel Obazee
 * Date created: October 11, 2025
 */
package danielobazeeproj11;

// Main class to test the Account hierarchy
public class DanielObazeeProj11 {
    public static void main(String[] args) {
        
        // Create an array of Account references with size 4
        Account[] accounts = new Account[4];

        // Initialize first two elements as CheckingAccount objects
        accounts[0] = new CheckingAccount(101, 1000.0);
        accounts[1] = new CheckingAccount(102, 500.0);

        // Initialize last two elements as SavingsAccount objects with interest rates
        accounts[2] = new SavingsAccount(201, 800.0, 0.06);
        accounts[3] = new SavingsAccount(202, 600.0, 0.05);

        // Loop through each account and perform operations
        for (Account acc : accounts) {
            acc.deposit(200.0);      // Deposit $200 into each account
            acc.withdraw(300.0);     // Attempt to withdraw $300 from each account
            System.out.println(acc); // Print account details using polymorphic toString()

            // If the account is a SavingsAccount, apply interest and print updated info
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest(); // Cast and call addInterest()
                System.out.println("After interest: " + acc); // Print updated balance
            }
        }
    }
}

// Base class representing a generic bank account
class Account {
    private int id;           // Unique account ID
    private double balance;   // Current account balance

    // Default constructor initializing with default values
    public Account() {
        this.id = 0;
        this.balance = 0.0;
    }

    // Constructor with parameters to set ID and initial balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Deposit method to add funds to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method in base class does nothing (to be overridden)
    public void withdraw(double amount) {
        // No implementation in base class
    }

    // Returns a string representation of the account
    public String toString() {
        return "Account ID: " + id + ", Balance: $" + String.format("%.2f", balance);
    }
}

// Subclass representing a checking account
class CheckingAccount extends Account {
    // Constructor that calls the superclass constructor
    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    // Override withdraw method with checking account rules
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }

    // Override toString to specify account type
    @Override
    public String toString() {
        return "CheckingAccount - " + super.toString();
    }
}

// Subclass representing a savings account
class SavingsAccount extends Account {
    private double interestRate; // Interest rate in decimal form (e.g., 0.06 for 6%)

    // Constructor that sets ID, balance, and interest rate
    public SavingsAccount(int id, double balance, double interestRate) {
        super(id, balance);
        this.interestRate = interestRate;
    }

    // Setter for interest rate
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }

    // Getter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Override withdraw method with savings account rules
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 500) {
            setBalance(getBalance() - amount);
        }
    }

    // Method to apply interest to the balance
    public void addInterest() {
        setBalance(getBalance() * (1 + interestRate));
    }

    // Override toString to include interest rate
    @Override
    public String toString() {
        return "SavingsAccount - " + super.toString() + ", Interest Rate: " + (interestRate * 100) + "%";
    }
}