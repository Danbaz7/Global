# 🧮 CSSI 121 Project 7 – Array Search & Sort Menu

### 👤 Author: Daniel Obazee

### 📅 Date: November 17, 2024

## 📌 Overview

This C++ console application presents a menu-driven interface for performing operations on arrays. Users can choose to **search** for a value using linear search or **sort** an array with one of three classic algorithms: selection sort, insertion sort, or bubble sort.

The array used is of fixed size (`int a[9]`) and the user enters values manually through keyboard input.

## 🧠 Key Features

- 🔎 **Linear Search**: Locate a number in the array and display its index.
- 📊 **Selection Sort**: Sort the array in ascending order by selecting the minimum each time.
- 🧩 **Insertion Sort**: Sort values by inserting each into its correct position.
- 💨 **Bubble Sort**: Sort using repeated swapping of adjacent elements.
- 🖨️ **Print Output**: Nicely formatted array display (5 elements per line).
- ✅ **Menu Loop**: Continues until the user selects "Exit".

## 📂 Functions

| Function Name     | Description                                           |
| ----------------- | ----------------------------------------------------- |
| `menu()`          | Displays the available options.                       |
| `fill_array()`    | Lets user input values to populate the array.         |
| `print_array()`   | Prints the array values (5 per line).                 |
| `linear_search()` | Returns index of a searched key or `-1` if not found. |
| `select_sort()`   | Sorts array using selection sort.                     |
| `insert_sort()`   | Sorts array using insertion sort.                     |
| `bubble_sort()`   | Sorts array using bubble sort.                        |
| `swap()`          | Utility function to swap two integers.                |
