# 🗡️ Fantasy Weapon Simulator — Project 15

**Author:** Daniel Obazee  
**Version:** 04/09/2025  
**Course:** CSCI 221 – Object-Oriented Programming  
**Instructor:** Dr. Zeng  
**Email:** deobazee@fhsu.edu

This C++ application allows users to create, customize, and simulate various fantasy weapons including daggers, rapiers, and longswords. Built using object-oriented principles such as inheritance, polymorphism, and dynamic memory management.

---

## 📦 File Overview

| File Name             | Purpose                                              |
| --------------------- | ---------------------------------------------------- |
| `application.cpp`     | Main application logic; weapon creation & simulation |
| `BladedWeapon.h/.cpp` | Abstract base class for all weapons                  |
| `Dagger.h/.cpp`       | Derived class representing a dagger                  |
| `Rapier.h/.cpp`       | Derived class representing a rapier                  |
| `LongSword.h/.cpp`    | Derived class representing a longsword               |

---

## 🧠 Program Features

### 🌟 Object-Oriented Design

- `BladedWeapon` serves as the abstract interface for all weapon types.
- Derived classes (`Dagger`, `Rapier`, `LongSword`) override key methods like `getDamage()` and `rollDamage()`.

### ⚙️ Weapon Properties

- **Name**: Custom string assigned by the user.
- **Damage Type**: Specific to each weapon class.
- **Cost**: Randomized or fixed based on weapon type.
- **Damage Roll**: Random value based on the weapon's power.

### 🪄 Interactive CLI

- User selects weapon type.
- Assigns a custom name.
- Optionally creates additional weapons.
- Outputs stats and damage simulation for each weapon.

---

### 🧪 Sample Interaction

Create a weapon:

1. Dagger
2. Rapier
3. LongSword
   Enter your choice (1/2/3): 2
   Enter a name for your weapon: Sting
   Weapon created successfully!
   Do you want to create another weapon? (y/n): y
   ...

Your weapons:
Name: Sting, Type: Piercing, Cost: 15 silver pieces
Rolling damage: 8

### 👨‍🏫 Educational Purpose

This application reinforces core C++ concepts:

- Inheritance and polymorphism
- Pointer management and dynamic memory
- Input/output formatting and object encapsulation
