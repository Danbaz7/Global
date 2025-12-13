// Program name: DanielObazeeProject02.java
// Author: Daniel Obazee
// Date created: August 23, 2025
// Program description: This program calculates the coin breakdown of a given amount in cents.
// It determines how many quarters, dimes, nickels, and pennies make up the entered amount.
// Additionally, it generates a random cent value between 1 and 99 and performs the same coin breakdown.
// The program uses:
// - Scanner class for user input
// - Integer division and modulus operations for coin calculations
// - Math.random() to simulate a random cent value


import java.util.* ;



/**
 *
 * @author danielobazee
 */
public class DanielObazeeProject02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in cent");
        int answer = input.nextInt();
       
        int quaters = answer / 25;
        int remainingCents = answer % 25;
        
        int dimes = remainingCents/10;
        remainingCents = remainingCents % 10;
        
        int nickels = remainingCents / 5;
        remainingCents = remainingCents % 5;
        
        int pennies = remainingCents / 1;
        
        
        
        System.out.println("you have " + "" + answer +
                " cent(s). That is : \n"
                 + quaters + " " + "quaters \n"
                 + dimes + " " + "dimes \n"
                 + nickels + " " + "nickels \n"
                 + pennies + " " + "pennies");  
     
     
//RANDOM VERSION     


       System.out.println("RANDOM GENERATOR NUMBER VERSION");
       
       int cent = 1 + (int)(Math.random() * 99); 
       
       int randomQuaters = cent / 25;
        int remainingRandomCents = cent % 25;
        
        int randomDimes = remainingRandomCents/10;
        remainingRandomCents = remainingRandomCents % 10;
        
        int randomNickels = remainingRandomCents / 5;
        remainingRandomCents = remainingRandomCents % 5;
        
        int randomPennies = remainingRandomCents / 1;
        
        
        System.out.println("you have " + "" + cent +
                " cent(s) as your random version That is : \n"
                  + randomQuaters + " " + "quaters \n"
                  + randomDimes + " " + "dimes \n"
                  + randomNickels + " " + "nickels \n"
                 + randomPennies + " " + "pennies");  
        
        
        
      }
    
}
