
package danielobazeeproj8;
import java.util.*;


/*
 * Program name: DanielObazeeProj8.java
 * Author: Daniel Obazee
 * Date created: September 13, 2025
 * 
/ * Program description:
 * 
 * A coin matrix converter that takes a number between 0 and 511 and:
 *  - converts it to a 9-bit binary string
 *  - displays a 3x3 matrix of coins using 'H' 0 for heads and 'T' 1 for tails
 
 *   input validation for range
 *   use of ternary operator for character mapping
 */

public class DanielObazeeProj8 {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number between 0 and 511 representating the state of the coins: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0 || number > 511) {
            System.out.println("Invalid input. Please enter a number between 0 and 511.");
            return;
        }

        // Convert number to 9-digit binary string
        String binaryString = String.format("%9s", Integer.toBinaryString(number)).replace(' ', '0');

        // Display matrix
        for (int i = 0; i < binaryString.length(); i++) {
            char coin = binaryString.charAt(i) == '0' ? 'H' : 'T'; //use of tenary operator to assign value to coin
            System.out.print(coin + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println(); // New line after every 3 coins
            }
        }
    }
    
}
