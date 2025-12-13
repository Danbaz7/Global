
package danielobazeeproj6;

import java.util.Scanner;
/**
 *Program name: DanielObazeeProject06.java
 * Author: Daniel Obazee
 * Date created: September 7, 2025
 * 
 *   This program reinforces string–processing concepts by:
 *   - Reading a line of text from the user and counting all English letters.
 *   - Prompting the user for a character and counting its occurrences (case-insensitive).
 *   - Returning –1 if the specified character is not an English letter.
 *   - Allowing the user to repeat tests via a do-while loop.
 */
public class DanielObazeeProj6 {

    // Method 1: Count all English letters in the string
    
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    // Method 2: Count specific English letter (case-insensitive)
    public static int countLetters(String s, char ch) {
        if (!Character.isLetter(ch)) {
            return -1;
        }

        int count = 0;
        char target = Character.toLowerCase(ch);

        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char tryAgain;

        do {
            // Prompt for string input
            System.out.print("Enter a string: ");
            String userString = input.nextLine();

            // Call first method
            int totalLetters = countLetters(userString);
            System.out.println("The result of calling function int countLetters(String s) is: " + totalLetters);

            // Prompt for character input
            System.out.print("Enter a char: ");
            String charInput = input.nextLine();

            // Validate single character input
            char ch = charInput.length() > 0 ? charInput.charAt(0) : ' ';

            // Call second method
            int specificCount = countLetters(userString, ch);
            System.out.println("The result of calling function int countLetters(String s, char ch) is: " + specificCount);

            // Ask to repeat
            System.out.print("Do you want to do another test? Y/N: ");
            tryAgain = input.nextLine().toUpperCase().charAt(0);

        } while (tryAgain == 'Y');

        System.out.println("Program ended.");
        input.close();
    }
    
}
