
package danielobazeemystringproj10;

/*******************************************************************************
 *   This program demonstrates object-oriented programming concepts by:
 *
 *   - Defining a danielObazeeMyStringProj10 class that models a custom string
 *     implementation using a character array, without relying on built-in
 *     String or StringBuffer classes.
 *
 *   - Encapsulating one private field:
 *        data (a char[] array representing the string content).
 *
 *   - Implementing a constructor:
 *        danielObazeeMyStringProj10(char[] chars) – initializes the object by
 *         copying the input character array into the internal data field.
 *         The constructor uses the `this` keyword to assign the parameter to
 *         the instance field, avoiding ambiguity.
 *
 *   - Providing instance methods to mimic common string operations:
 *       - charAt(int i) – returns the character at the specified index.
 *       - length() – returns the number of characters in the string.
 *       - substring(int begin, int end) – returns a new object containing the
 *         characters from index begin to end-1.
 *       - toLowerCase() – returns a new object with all characters converted
 *         to lowercase (ASCII only).
 *       - equals(danielObazeeMyStringProj10 other) – compares two objects for
 *         character-by-character equality.
 *
 *   - Implementing a static method:
 *       - valueOf(int i) – converts an integer into a danielObazeeMyStringProj10
 *         object by manually extracting digits and handling negative values.
 *
 *   - Including a toString() method:
 *       - Converts the internal character array into a printable Java String
 *         using a StringBuilder for display purposes.
 *
 *   - Using a driver method (main) to:
 *       - Create and test multiple instances of the class.
 *       - Demonstrate each method’s functionality with sample data.
 *       - Print results to the console for verification.
 *
 *   - Emphasizing the use of the `this` keyword:
 *       - Used in constructors and methods to clearly distinguish between
 *         instance fields and parameters, especially when names overlap.
 ******************************************************************************/


public class danielObazeeMyStringProj10 {
    private char[] data;

    // Constructor
    public danielObazeeMyStringProj10(char[] chars) {
        data = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            data[i] = chars[i];
        }
    }

    // charAt(i): returns character at index i
    public char charAt(int i) {
        if (i < 0 || i >= data.length) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return data[i];
    }

    // length(): returns length of the string
    public int length() {
        return data.length;
    }

    // substring(begin, end): returns a new object from begin to end-1
    public danielObazeeMyStringProj10 substring(int begin, int end) {
        if (begin < 0 || end > data.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid substring range");
        }
        char[] sub = new char[end - begin];
        for (int i = begin; i < end; i++) {
            sub[i - begin] = data[i];
        }
        return new danielObazeeMyStringProj10(sub);
    }

    // toLowerCase(): returns a new object with all lowercase characters
    public danielObazeeMyStringProj10 toLowerCase() {
        char[] lower = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'A' && data[i] <= 'Z') {
                lower[i] = (char)(data[i] + 32);
            } else {
                lower[i] = data[i];
            }
        }
        return new danielObazeeMyStringProj10(lower);
    }

    // equals(other): checks if two objects are equal
    public boolean equals(danielObazeeMyStringProj10 other) {
        if (this.length() != other.length()) return false;
        for (int i = 0; i < data.length; i++) {
            if (this.data[i] != other.data[i]) return false;
        }
        return true;
    }

    // valueOf(i): returns an object representing the integer i
    public static danielObazeeMyStringProj10 valueOf(int i) {
        boolean isNegative = i < 0;
        i = Math.abs(i);
        int length = (i == 0) ? 1 : 0;
        int temp = i;
        while (temp > 0) {
            temp /= 10;
            length++;
        }
        if (isNegative) length++;

        char[] chars = new char[length];
        int index = length - 1;
        if (i == 0) {
            chars[0] = '0';
        } else {
            while (i > 0) {
                chars[index--] = (char)('0' + i % 10);
                i /= 10;
            }
        }
        if (isNegative) {
            chars[0] = '-';
        }
        return new danielObazeeMyStringProj10(chars);
    }

    // toString(): helper method to print the object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char c : data) {
            sb.append(c);
        }
        return sb.toString();
    }

    // Main method to test all methods
    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        danielObazeeMyStringProj10 str = new danielObazeeMyStringProj10(chars);

        System.out.println("Original: " + str.toString());
        System.out.println("charAt(1): " + str.charAt(1));
        System.out.println("length(): " + str.length());
        System.out.println("substring(1, 4): " + str.substring(1, 4).toString());
        System.out.println("toLowerCase(): " + str.toLowerCase().toString());

        danielObazeeMyStringProj10 str2 = new danielObazeeMyStringProj10(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("equals(str2): " + str.equals(str2));

        danielObazeeMyStringProj10 numStr = danielObazeeMyStringProj10.valueOf(-12345);
        System.out.println("valueOf(-12345): " + numStr.toString());
    }
}
