# Custom String Implementation – `danielObazeeMyStringProj10`

This Java program demonstrates **object-oriented programming concepts** by building a custom string class using a character array, without relying on Java’s built-in `String` or `StringBuffer` classes.

## 📌 Features

- **Encapsulation**

  - Private field: `char[] data` stores the string content.

- **Constructor**

  - `danielObazeeMyStringProj10(char[] chars)` – initializes the object by copying the input array.

- **Instance Methods**

  - `charAt(int i)` → returns the character at the given index.
  - `length()` → returns the number of characters.
  - `substring(int begin, int end)` → returns a new object containing characters from `begin` to `end - 1`.
  - `toLowerCase()` → returns a new object with all characters converted to lowercase (ASCII only).
  - `equals(danielObazeeMyStringProj10 other)` → compares two objects for character-by-character equality.

- **Static Method**

  - `valueOf(int i)` → converts an integer into a `danielObazeeMyStringProj10` object, handling negative values manually.

- **Utility**

  - `toString()` → converts the internal character array into a printable Java `String`.

- **Driver (`main` method)**
  - Demonstrates all functionality:
    - Creating instances
    - Accessing characters
    - Checking length
    - Extracting substrings
    - Converting to lowercase
    - Comparing equality
    - Converting integers to custom string objects
