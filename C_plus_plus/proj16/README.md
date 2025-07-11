# 🕒 Time Format Converter — Project 16

**Author:** Daniel Obazee  
**Version:** 04/18/2025  
**Course:** CSCI 221 – Object-Oriented Programming  
**Instructor:** Dr. Zeng  
**Email:** deobazee@fhsu.edu

This C++ program interactively converts 24-hour time inputs into their corresponding 12-hour format using custom exception handling for invalid inputs. It reinforces exception design, input validation, and time formatting logic.

---

## 🧩 Program Description

The user inputs time in `hh:mm` format (24-hour), and the program:

1. Validates the format and range.
2. Converts valid input into 12-hour format (`AM`/`PM`).
3. Handles invalid inputs using a custom exception class.
4. Loops for repeated interaction until the user exits.

---

## 🛠️ Features & Structure

### 🎯 Key Functions

| Function                  | Purpose                                                         |
| ------------------------- | --------------------------------------------------------------- |
| `isValidTime(string)`     | Validates 24-hour input for format and numeric ranges           |
| `convertTo12Hour(string)` | Converts valid 24-hour time to 12-hour string format with AM/PM |

### 🚨 Custom Exception

`TimeFormatMistake` — Derived from `std::exception`, used to clearly report invalid time entries with a custom message.

### 📥 User Interaction Flow

- Prompt user to enter time in `hh:mm`
- Validate using `isValidTime()`
- If valid: convert and display with `convertTo12Hour()`
- If invalid: catch and display friendly error via `TimeFormatMistake`
- Prompt to retry or quit

---
