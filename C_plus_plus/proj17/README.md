# 🧮 Generic Set Tester — Project 17 (CSCI 221)

**Author:** Daniel Obazee  
**Date:** April 25, 2025  
**Course:** CSCI 221

This application provides an interactive test harness for a template-based `Set<T>` class, allowing users to work with dynamically managed sets of integers or strings. It ensures uniqueness, supports membership testing, and demonstrates the power of generic programming in C++.

---

## 📁 File Structure

| File                 | Description                                          |
| -------------------- | ---------------------------------------------------- |
| `setapplication.cpp` | Main application interface for testing the Set class |
| `set.hpp`            | Template header implementing `Set<T>`                |

---

## 📦 Set Class Features

#### ✅ Core Functionality

- `addItem(T item)` — Adds an item to the set if it’s not already present.
- `removeItem(T item)` — Removes an item from the set.
- `isMember(T item)` — Checks if an item is part of the set.
- `getCount()` — Returns the number of items in the set.
- `toArray()` — Returns a dynamically allocated array of set items.

### 🛡️ Memory Safety

- The `toArray()` method allocates memory which the caller must `delete[]`.
- All internal operations are safely managed to prevent duplication or leaks.

---

## 🧪 Application Flow

1. User chooses a test mode:

   - Integer Set
   - String Set

2. Inputs values (terminated by sentinel: `-1` for integers, `"STOP"` for strings).

3. Optionally tests membership with a follow-up query.

4. Displays the contents of the set by retrieving a dynamic array.

5. Frees allocated memory after display.
