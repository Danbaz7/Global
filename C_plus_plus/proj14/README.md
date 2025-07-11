# 🧮 Recursive Sum & String Length Program

### 👤 Author: Daniel Obazee

### 📅 Date: December 8, 2024

### 🎓 Course: CSCI 121 — Project 14

This is a C++ console-based program that demonstrates the use of **recursion** to perform basic algorithmic tasks: summing integers and measuring string length. The user is prompted to enter a positive integer and a sentence. The program then calculates the total sum from 1 to _n_ and the number of characters in the sentence using recursive functions.

---

## 🚀 Features

- 🔢 **Recursive Sum Calculator**  
  Computes the sum `1 + 2 + ... + n` using recursion.

- 📏 **Custom String Length Function**  
  Recursively determines the number of characters in a `char[]` string (ignoring the null terminator).

- 🔁 **Looping Interface**  
  Repeats until the user decides to stop.

---

## 📂 Function Overview

| Function               | Purpose                                                                   |
| ---------------------- | ------------------------------------------------------------------------- |
| `sum(int n)`           | Recursively returns the sum from 1 to `n`                                 |
| `str_length(char s[])` | Recursively returns the length of C-style string `s[]` (excluding `'\0'`) |

---

## 💻 How It Works

```plaintext
1. Prompt user to enter a positive integer.
2. Display the recursive sum from 1 to n.
3. Prompt user to enter a sentence.
4. Display the character count including spaces.
5. Ask if the user wants to repeat the process.
```
