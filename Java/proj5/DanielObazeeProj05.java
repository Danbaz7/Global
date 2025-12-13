/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package danielobazeeproj05;

import java.util.Scanner;

/**
 * Program name: DanielObazeeProject04.java
 * Author: Daniel Obazee
 * Date created: September 5, 2025
 * 
 * Program description:
 * 
 * A mortgage calculator that prints an amortization table and tracks:
 *  - total interest paid
 * 
 * Includes extra credit:
 *  1) do-while loop to retry
 *  2) both for-loop and while-loop versions (commented)
 * 
 * @author danielobazee
 **/
public class DanielObazeeProj05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char tryAgain;

        // allow user to run calculator multiple times
        do {
            // prompt for loan parameters
            System.out.print("Enter the principal to borrow:\t");
            double principal = input.nextDouble();

            System.out.print("Enter the interest rate (decimal, e.g., 0.05 for 5%):\t");
            double annualRate = input.nextDouble();

            System.out.print("Enter the term (in years):\t");
            int termYears = input.nextInt();

            // calculate monthly values
            int totalMonths = termYears * 12;
            double monthlyRate = annualRate / 12.0;

            // compute monthly payment
            double monthlyPayment = principal 
                    * monthlyRate 
                    * Math.pow(1 + monthlyRate, totalMonths)
                    / (Math.pow(1 + monthlyRate, totalMonths) - 1);

            // header for amortization table
            System.out.printf("\nMonthly Payment:\t$\t%.2f\n\n", monthlyPayment);
            System.out.println(
                "Month\t\tPayment\t\t\t Interest\t\t\tTotal Interest\t\t Principal\t\t Balance\n"
            );

            double balance = principal;
            double totalInterest = 0.0;

            // amortization schedule using for-loop
            for (int month = 1; month <= totalMonths; month++) {
                double interest = balance * monthlyRate;
                double principalPayment = monthlyPayment - interest;
                balance -= principalPayment;
                totalInterest += interest;

                // print one amortization row
                System.out.printf(
                    "%-5d\t$\t%7.2f\t\t$\t%7.2f\t\t$\t%13.2f\t\t$\t%9.2f\t$\t%10.2f\n",
                    month,
                    monthlyPayment,
                    interest,
                    totalInterest,
                    principalPayment,
                    balance
                );
            }

            // Extra Credit: while-loop version for instructor review (commented out)

         /*   int month = 1;
            double balance2 = principal;
            double totalInterest2 = 0.0;
            while (month <= totalMonths) {
                double interest = balance2 * monthlyRate;
                double principalPayment = monthlyPayment - interest;
                balance2 -= principalPayment;
                totalInterest2 += interest;

                System.out.printf(
                    "%-5d\t$\t%7.2f\t\t$\t%7.2f\t\t$\t%13.2f\t\t$\t%9.2f\t$\t%10.2f\n",
                    month,
                    monthlyPayment,
                    interest,
                    totalInterest2,
                    principalPayment,
                    balance2
                );
                month++;
            }
        */

            // summary output
            System.out.printf("\nTotal interest paid:\t$\t%.2f\n", totalInterest);

            // prompt to repeat
            System.out.print("\nWould you like to try again? (Y/N):\t");
            tryAgain = input.next().toUpperCase().charAt(0);

        } while (tryAgain == 'Y');

        System.out.println("\nThank you for using the mortgage calculator!");
        input.close();
    }
}
