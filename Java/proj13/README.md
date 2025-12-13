# PrintCalendar – Java Console Calendar Program

This Java program prints a formatted monthly calendar to the console. It demonstrates the use of the `Calendar` and `GregorianCalendar` classes for date manipulation and formatted output.

## 📌 Features

- **Command-line arguments**

  - `java PrintCalendar <month> <year>` → prints the specified month and year.
  - `java PrintCalendar <month>` → prints the specified month in the current year.
  - `java PrintCalendar` → prints the current month and year.

- **Header formatting**

  - Displays the month name and year.
  - Prints a separator line and weekday headers (`Sun Mon Tue Wed Thu Fri Sat`).

- **Date calculations**

  - Uses `GregorianCalendar` to determine:
    - The first day of the week for the given month/year.
    - The number of days in the month.

- **Calendar layout**
  - Prints leading spaces for alignment.
  - Prints each day of the month in a grid format.
  - Wraps to a new line after Saturday.
