# Temperature Comparison Program

This Java application demonstrates **object-oriented programming concepts** by modeling and comparing temperature values in Celsius and Fahrenheit.

## 📌 Features

- **Temperature class** with:

  - Fields: `degree` (double) and `scale` (char: 'C' or 'F').
  - Four overloaded constructors:
    - `Temperature()` → default (0.0 °C).
    - `Temperature(double degree)` → degree in Celsius.
    - `Temperature(char scale)` → 0.0 in given scale.
    - `Temperature(double degree, char scale)` → both values.
  - Accessors:
    - `getDegreeInCelsius()` → returns value in Celsius.
    - `getDegreeInFahrenheit()` → returns value in Fahrenheit.
  - Mutators:
    - `setDegree(double degree)`
    - `setDegree(char scale)`
    - `setDegree(double degree, char scale)`
  - Comparison methods:
    - `equals(Temperature obj)`
    - `isLessThan(Temperature obj)`
    - `isGreaterThan(Temperature obj)`

- **Driver class (`DanielObazeeJavaApplication11`)**:
  - Creates four `Temperature` objects using different constructors.
  - Displays initial values in both Celsius and Fahrenheit.
  - Prompts the user to update each object’s degree and scale via `Scanner`.
  - Prints updated values in both Celsius and Fahrenheit.
  - Compares all pairs of temperatures using `equals`, `isLessThan`, and `isGreaterThan`.
