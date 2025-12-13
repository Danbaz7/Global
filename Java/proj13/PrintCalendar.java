/*
 Program name: PrintCalender.java
 Author: Daniel Obazee
 Date created: November 8, 2025
 */
package printcalender;
import java.util.*;

public class PrintCalendar {
    public static void main(String[] args) {
        // Step 1: Determine month and year from command line
        Calendar calendar = new GregorianCalendar();
        int month, year;

        if (args.length == 2) {
            month = Integer.parseInt(args[0]);
            year = Integer.parseInt(args[1]);
        } else if (args.length == 1) {
            month = Integer.parseInt(args[0]);
            year = calendar.get(Calendar.YEAR);
        } else {
            month = calendar.get(Calendar.MONTH) + 1; // Calendar months are 0-based
            year = calendar.get(Calendar.YEAR);
            
        }

        // Step 2: Print header
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        System.out.println("       " + monthNames[month - 1] + " " + year);
        System.out.println("-----------------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Step 3: Set calendar to first day of given month/year
        calendar.set(year, month - 1, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); // Sunday=1
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Step 4: Print leading spaces
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }

        // Step 5: Print days of month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}