
package danielobazeejavaapplication11;

import java.util.*;


/*******************************************************************************
 *   This program demonstrates object-oriented programming concepts by:
 *
 *   - Defining a Temperature class that models a temperature value with two
 *     fields:
 *       • degree (a double representing the numeric value)
 *       • scale (a char, either 'C' for Celsius or 'F' for Fahrenheit).
 *
 *   - Implementing four constructors to illustrate constructor overloading:
 *       • Temperature() – default constructor, sets degree to 0.0 and scale to 'C'.
 *       • Temperature(double degree) – initializes with a degree in Celsius.
 *       • Temperature(char scale) – initializes with 0.0 in the given scale.
 *       • Temperature(double degree, char scale) – initializes with both values.
 *     Each constructor uses the `this` keyword to assign parameter values to
 *     the instance fields, preventing ambiguity between local variables and fields.
 *
 *   - Providing accessor (getter) methods:
 *       • getDegreeInCelsius() – returns the temperature in Celsius. If the
 *         internal scale is Fahrenheit, it converts using (degree - 32) * 5/9.
 *       • getDegreeInFahrenheit() – returns the temperature in Fahrenheit. If
 *         the internal scale is Celsius, it converts using (degree * 1.8) + 32.
 *
 *   - Providing mutator (setter) methods:
 *       • setDegree(double degree) – updates only the numeric field.
 *       • setDegree(char scale) – updates only the scale field, converting to uppercase.
 *       • setDegree(double degree, char scale) – updates both fields at once.
 *     In all setters, `this.degree` and `this.scale` are used to clearly
 *     distinguish instance fields from method parameters.
 *
 *   - Implementing comparison methods:
 *       • equals(Temperature obj) – compares two Temperature objects by
 *         converting both to Celsius and checking if the difference is less
 *         than a small tolerance (0.0001).
 *       • isLessThan(Temperature obj) – returns true if the current object’s
 *         Celsius value is less than the other’s.
 *       • isGreaterThan(Temperature obj) – returns true if the current object’s
 *         Celsius value is greater than the other’s.
 *
 *   - Using a driver class (DanielObazeeJavaApplication11) to:
 *       • Create four Temperature objects using different constructors.
 *       • Display their initial values in both Celsius and Fahrenheit.
 *       • Prompt the user via Scanner to update each object’s degree and scale.
 *       • Call the setter methods to apply user input.
 *       • Print updated values in both Celsius and Fahrenheit.
 *       • Compare all pairs of Temperature objects using equals, isLessThan,
 *         and isGreaterThan, displaying the results in formatted output.
 *
 *   - Employing formatted console output (System.out.printf) to ensure values
 *     are displayed with two decimal places for clarity.
 *
 *   - Structuring the program into two classes:
 *       • Temperature – the data model with fields, constructors, and methods.
 *       • DanielObazeeJavaApplication11 – the driver class containing main()
 *         and a helper method compareTemps() that prints comparison results.
 *
 *   Overall, the program illustrates how to design a class with multiple
 *   constructors, conversion logic, mutators, accessors, and comparison
 *   functions, while using the `this` keyword to avoid ambiguity between
 *   instance fields and parameters.
 ******************************************************************************/



public class DanielObazeeJavaApplication11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // === First Temperature: default constructor ===
        Temperature temp1 = new Temperature();
        System.out.printf("The first Temperature is %.2f C.%n", temp1.getDegreeInCelsius());
        System.out.printf("The first Temperature is %.2f F.%n", temp1.getDegreeInFahrenheit());

        // Prompt user to update first temperature
        System.out.println("Set the degree (a number) and the scale (F or C) of the first Temperature.");
        System.out.print("First set the degree: ");
        double degree1 = input.nextDouble();
        System.out.print("Now set the scale: ");
        char scale1 = input.next().toUpperCase().charAt(0);
        temp1.setDegree(degree1, scale1);
        System.out.printf("Now the first Temperature is %.2f C.%n", temp1.getDegreeInCelsius());
        System.out.printf("which is %.2f F.%n%n", temp1.getDegreeInFahrenheit());

        // === Second Temperature: constructor with double ===
        Temperature temp2 = new Temperature(32);
        System.out.printf("The second Temperature is %.2f C.%n", temp2.getDegreeInCelsius());
        System.out.printf("The second Temperature is %.2f F.%n", temp2.getDegreeInFahrenheit());

        // Prompt user to update second temperature
        System.out.println("Set the degree (a number) and the scale (F or C) of the second Temperature.");
        System.out.print("First set the degree: ");
        double degree2 = input.nextDouble();
        System.out.print("Now set the scale: ");
        char scale2 = input.next().toUpperCase().charAt(0);
        temp2.setDegree(degree2, scale2);
        System.out.printf("The second Temperature is %.2f C.%n", temp2.getDegreeInCelsius());
        System.out.printf("The second Temperature is %.2f F.%n%n", temp2.getDegreeInFahrenheit());

        // === Third Temperature: constructor with char ===
        Temperature temp3 = new Temperature('F');
        System.out.printf("The third Temperature is %.2f F.%n", temp3.getDegreeInFahrenheit());
        System.out.printf("which is %.2f C.%n", temp3.getDegreeInCelsius());

        // Prompt user to update third temperature
        System.out.println("Set the degree (a number) and the scale (F or C) of the third Temperature.");
        System.out.print("First set the degree: ");
        double degree3 = input.nextDouble();
        System.out.print("Now set the scale: ");
        char scale3 = input.next().toUpperCase().charAt(0);
        temp3.setDegree(degree3, scale3);
        System.out.printf("The third Temperature is %.2f C.%n", temp3.getDegreeInCelsius());
        System.out.printf("which is %.2f F.%n%n", temp3.getDegreeInFahrenheit());

        // === Fourth Temperature: constructor with double and char ===
        Temperature temp4 = new Temperature(98.6, 'F');
        System.out.printf("The fourth Temperature is %.2f C.%n", temp4.getDegreeInCelsius());
        System.out.printf("The fourth Temperature is %.2f F.%n", temp4.getDegreeInFahrenheit());

        // Prompt user to update fourth temperature
        System.out.println("Set the degree (a number) and the scale (F or C) of the fourth Temperature.");
        System.out.print("First set the degree: ");
        double degree4 = input.nextDouble();
        System.out.print("Now set the scale: ");
        char scale4 = input.next().toUpperCase().charAt(0);
        temp4.setDegree(degree4, scale4);
        System.out.printf("The fourth Temperature is %.2f C.%n", temp4.getDegreeInCelsius());
        System.out.printf("which is %.2f F.%n%n", temp4.getDegreeInFahrenheit());

        // === Comparisons between all temperatures ===
        compareTemps("first", temp1, "second", temp2);
        compareTemps("first", temp1, "third", temp3);
        compareTemps("first", temp1, "fourth", temp4);
        compareTemps("second", temp2, "third", temp3);
        compareTemps("second", temp2, "fourth", temp4);
        compareTemps("third", temp3, "fourth", temp4);
    }

    /**
     * Compares two Temperature objects and prints the results.
     *
     * @param name1 label for the first temperature
     * @param t1    first Temperature object
     * @param name2 label for the second temperature
     * @param t2    second Temperature object
     */
    public static void compareTemps(String name1, Temperature t1, String name2, Temperature t2) {
        if (t1.equals(t2)) {
            System.out.printf("The %s Temperature is equal to the %s.%n", name1, name2);
        } else {
            System.out.printf("The %s Temperature is not equal to the %s.%n", name1, name2);
        }

        if (t1.isLessThan(t2)) {
            System.out.printf("The %s Temperature is less than the %s.%n", name1, name2);
        } else {
            System.out.printf("The %s Temperature is not less than the %s.%n", name1, name2);
        }

        if (t1.isGreaterThan(t2)) {
            System.out.printf("The %s Temperature is greater than the %s.%n%n", name1, name2);
        } else {
            System.out.printf("The %s Temperature is not greater than the %s.%n%n", name1, name2);
        }
    }
}

/**
 * Temperature Class
 * -----------------
 * Represents a temperature value in either Celsius or Fahrenheit.
 * Provides methods for conversion, comparison, and updating values.
 */
class Temperature {
    private double degree; // numeric value of the temperature
    private char scale;    // 'C' for Celsius, 'F' for Fahrenheit

    /** Default constructor: 0 degrees Celsius */
    public Temperature() {
        this.degree = 0.0;
        this.scale = 'C';
    }

    /** Constructor with degree (assumes Celsius) */
    public Temperature(double degree) {
        this.degree = degree;
        this.scale = 'C';
    }

    /** Constructor with scale (assumes 0 degrees in that scale) */
    public Temperature(char scale) {
        this.degree = 0.0;
        this.scale = Character.toUpperCase(scale);
    }

    /** Constructor with both degree and scale */
    public Temperature(double degree, char scale) {
        this.degree = degree;
        this.scale = Character.toUpperCase(scale);
    }

    /** @return temperature in Celsius */
    public double getDegreeInCelsius() {
        if (scale == 'C') {
            return degree;
        } else {
            return (degree - 32) * 5 / 9;
        }
    }

    /** @return temperature in Fahrenheit */
    public double getDegreeInFahrenheit() {
        if (scale == 'F') {
            return degree;
        } else {
            return 1.8 * degree + 32;
        }
    }

    /** Set degree only (scale unchanged) */
    public void setDegree(double degree) {
        this.degree = degree;
    }

    /** Set scale only (degree unchanged) */
    public void setDegree(char scale) {
        this.scale = Character.toUpperCase(scale);
    }

    /** Set both degree and scale */
    public void setDegree(double degree, char scale) {
        this.degree = degree;
        this.scale = Character.toUpperCase(scale);
    }

    /** Compare equality (within tolerance) */
    public boolean equals(Temperature obj) {
        return Math.abs(this.getDegreeInCelsius() - obj.getDegreeInCelsius()) < 0.0001;
    }

    /** @return true if this < obj */
    public boolean isLessThan(Temperature obj) {
        return this.getDegreeInCelsius() < obj.getDegreeInCelsius();
    }

    /** @return true if this > obj */
    public boolean isGreaterThan(Temperature obj) {
        return this.getDegreeInCelsius() > obj.getDegreeInCelsius();
    }
}