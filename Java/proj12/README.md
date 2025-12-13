# Bank Account Hierarchy with Exception Handling – `DanielObazeeProj12`

This Java program demonstrates **object-oriented programming** and **exception handling** by extending a bank account hierarchy with custom exceptions for invalid transactions.

## 📌 Features

- **Custom Exceptions**

  - `IllegalAmountException` → thrown when deposit or withdrawal amounts are non‑positive.
  - `NoSufficientFundsException` → thrown when withdrawal rules are violated (e.g., insufficient balance, minimum balance requirement).

- **Base Class: `Account`**

  - Fields: `id` (int), `balance` (double).
  - Constructors: default and parameterized.
  - Methods:
    - `deposit(double amount)` → validates positive deposits, throws `IllegalAmountException`.
    - `withdraw(double amount)` → abstract behavior, overridden in subclasses.
    - Getters and setters for `id` and `balance`.
    - `toString()` → returns account details.

- **Subclass: `CheckingAccount`**

  - Overrides `withdraw(double amount)`:
    - Throws `IllegalAmountException` if amount ≤ 0.
    - Throws `NoSufficientFundsException` if withdrawal exceeds balance.
  - Overrides `toString()` to specify account type.

- **Subclass: `SavingsAccount`**

  - Adds field: `interestRate` (double).
  - Overrides `withdraw(double amount)`:
    - Throws `IllegalAmountException` if amount ≤ 0.
    - Throws `NoSufficientFundsException` if withdrawal would reduce balance below $500.
  - Method `addInterest()` → applies interest to balance.
  - Overrides `toString()` to include interest rate.

- **Driver Class: `DanielObazeeProj12`**
  - Creates an array of `Account` references.
  - Initializes with both `CheckingAccount` and `SavingsAccount` objects.
  - Demonstrates exception handling with `try...catch`.
  - Prints account details and applies interest to savings accounts.
