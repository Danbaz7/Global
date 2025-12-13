/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danielobazeeproject04;

import java.util.*;

// Program name: DanielObazeeProject04.java
// Author: Daniel Obazee
// Date created: August 28, 2025
// Program description:
// This program converts a binary string (composed of 0s and 1s) into its corresponding decimal value.
// It performs the conversion in two ways:
// - Part 1 uses Java’s built-in method `Integer.parseInt(binary, 2)` for direct conversion.
// - Part 2 manually calculates the decimal value by iterating through each binary digit and applying positional weights using `Math.pow()`.
// The program includes input validation to ensure only valid binary strings are processed, and it demonstrates both practical use of Java libraries and foundational understanding of binary number systems.

public class DanielObazeeProject04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
      System.out.println("Enter a binary number (e.g ., 1010:)");
      String binary  = input.nextLine();
      
      for(int i = 0; i < binary.length(); i++){
         
          char c = binary.charAt(i);
          
          if(c != '0' && c !='1'){        
             System.out.println("Invalid  binary input. Only 1's and 0's are allowed");
             return;
          }
        }
      
//********* BUILT IN IMPLEMENTATION ***********

       int decimalBuiltIn = Integer.parseInt(binary, 2);
       System.out.println("Decimal (built-in): " + decimalBuiltIn);


//********** MANUAL IMPLEMENTATION ***********
      
      int length = binary.length();
      int decimalManual = 0;
      
      for(int i = 0; i < length; i++ ){
        int bit = binary.charAt(i) - '0'; // Extracts number value from ASCII
        decimalManual += bit * Math.pow(2, length-1 - i);
        }
      
     System.out.println("Decimal (manual): " + decimalManual);          

    }
    
}
