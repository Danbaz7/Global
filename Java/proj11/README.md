# Bank Account Hierarchy – `DanielObazeeProj11`

This Java program demonstrates **object-oriented programming principles** by modeling a simple bank account system with inheritance and polymorphism.

## 📌 Features

- **Base Class: `Account`**

  - Fields: `id` (int), `balance` (double).
  - Constructors: default and parameterized.
  - Methods:
    - `deposit(double amount)` → adds funds.
    - `withdraw(double amount)` → placeholder (overridden in subclasses).
    - Getters and setters for `id` and `balance`.
    - `toString()` → returns account details.

- **Subclass: `CheckingAccount`**

  - Inherits from `Account`.
  - Overrides `withdraw(double amount)` → allows withdrawal if sufficient funds.
  - Overrides `toString()` → specifies account type.

- **Subclass: `SavingsAccount`**

  - Inherits from `Account`.
  - Adds field: `interestRate` (double).
  - Overrides `withdraw(double amount)` → enforces minimum balance of $500.
  - Method `addInterest()` → applies interest to balance.
  - Overrides `toString()` → includes interest rate.

- **Driver Class: `DanielObazeeProj11`**
  - Creates an array of `Account` references.
  - Initializes with both `CheckingAccount` and `SavingsAccount` objects.
  - Demonstrates polymorphism:
    - Deposits and withdrawals on all accounts.
    - Prints account details via overridden `toString()`.
    - Applies interest to savings accounts using `instanceof` and casting.
