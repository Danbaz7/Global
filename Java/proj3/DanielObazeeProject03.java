
package danielobazeeproject03;

import java.util.Scanner;
// Program name: DanielObazeeProject03.java
// Author: Daniel Obazee
// Date created: August 29, 2025
// Program description:
// This program evaluates a grade based on an integer score between 0 and 100.
// It uses both traditional `if-else` statements and a modern `switch` expression to determine the grade:
// - A score below 60 results in a failing grade.
// - Scores from 60 to 100 are mapped to letter grades (D, C, B, A).
// The program also includes a bonus feature that calculates the square root of a user-provided number
// using the `Math.pow()` method for practice with mathematical operations.

public class DanielObazeeProject03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
      System.out.println("Enter your integer score between (0-100)");
      
      int ans = input.nextInt();
      
      if(ans < 0 || ans  > 100){
         System.out.println("Enter an integer value (0-100)");
         return ;
      }
      
   if(ans >= 60 && ans < 70 ){
          
          System.out.println("Your grade is: D");
          
      }else if(ans >= 70 && ans < 80 ){
          
          System.out.println("Your grade is: C");
          
      }else if(ans >= 80 && ans < 90 ){
          
          System.out.println("Your grade is: B");
          
      }else if(ans >= 90 && ans <= 100){
          
          System.out.println("Your grade is: A");
          
      }else{
            
        
           System.out.println("You fluncked");
          }
      

/************* SWITCH VERSION *****************/
    
      System.out.println("The switch version says ...");
      
      switch(ans/10){
        
          case 10, 9 -> System.out.println("Your grade is: A");
          case 8 -> System.out.println("Your grade is: B");
          case 7 -> System.out.println("Your grade is: C");
          case 6 -> System.out.println("Your grade is: D");
//          case 5, 4, 3, 2, 1, 0 -> System.out.println("You fluncked the course.");
          default -> System.out.println("You fluncked.");

      }
              
// ************ PRACTICE **************


      System.out.println("BONUS: Enter a number to check the square root");
      double inputNumber = input.nextDouble();
      double trickySquareRoot = Math.pow(inputNumber, 0.5);
      System.out.println("using power as square root, the square root of your number = " + " " + trickySquareRoot);
    }
    
}
