# Banking App 💸

A simple interactive banking application built with vanilla JavaScript, HTML, and CSS.  
This project simulates core banking operations such as login, money transfer, loan requests, account closure, and transaction sorting.

## Features

- **User Authentication:**  
  Log in with a username and PIN to access your account.
- **Transaction History:**  
  View deposits and withdrawals with dynamic sorting.
- **Balance & Summary:**  
  Real-time calculation and display of account balance, total income, outflow, and interest.
- **Money Transfer:**  
  Transfer funds to other users by username.
- **Loan Requests:**  
  Request a loan if you have a deposit of at least 10% of the requested amount.
- **Account Closure:**  
  Delete your account securely using your credentials.
- **Sorting:**  
  Sort transactions in ascending order for easier review.

## Logic & Implementation

- **State Management:**  
  Each account is represented by an object containing owner info, movements, interest rate, PIN, and type.
- **UI Updates:**  
  All account actions trigger UI updates for movements, balance, and summary.
- **Event Handling:**  
  Button clicks and form submissions are managed with event listeners for login, transfer, loan, close, and sort actions.
- **Username Generation:**  
  Usernames are auto-generated from account owner names for easy login.
- **Validation:**  
  Transfers and loans are validated for sufficient balance and eligibility.

## Project Structure

```
Banking/
├── index.html
├── style.css
└── script.js
```

- `index.html` – Main app layout and forms.
- `style.css` – Responsive and modern styling.
- `script.js` – All banking logic and event handling.

## Example Accounts

- Username: `db` | PIN: `1111`
- Username: `jd` | PIN: `2222`
- Username: `stw` | PIN: `3333`
- Username: `ss` | PIN: `4444`

---

This project demonstrates modular JavaScript, DOM manipulation, and event-driven UI for a functional banking simulation.
