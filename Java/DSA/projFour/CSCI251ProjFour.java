
package csci251projfour;
/**
 * class CSCI251ProjFour. It is an interactive test class for MyHashTable
 * 
 * @author Mike Mireku Kwakye
 * @version March 9, 2025
 */
 
import java.util.Scanner;

public class CSCI251ProjFour
{
   public static void main(String args[]){
        String value;
        String key;
        int choice;
        Scanner input = new Scanner(System.in);
        MyHashTable<String, String> table = new MyHashTable<String, String>(10);
       
        do{
            menu();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch(choice){
            case 1:
                System.out.println("Enter an (Key, Value) pair that you will add to table ");
                System.out.print("Separate by white space: ");
                key = input.next();
                value = input.next();
                table.insert(key, value);
                System.out.println("(" + key + ", " + value + ") entered");
                break;
            case 2: 
                System.out.print("Enter a key that you will remove from table: ");
                key = input.next();
                value = table.remove(key);
                if(value != null)
                    System.out.println("Remove successfully completed. The removed value is " + value);   
                else
                    System.out.println("No such key in table");
                break;
            case 3:
                System.out.print("Enter the key that you want to search for: ");
                key = input.next();
                value = table.get(key);
                if(value == null)
                    System.out.println("No such data in table");
                else
                    System.out.println("The corresponding value is: " + value);
                break;
            case 4:
                if(table.isEmpty())
                    System.out.println("Table is empty");
                else
                    System.out.println(table);
                break;
            case 5:
                System.out.println("Make sure you run enough test before you turn it in");
                break;
            default:
                System.out.println("Wrong option. Please choose from menu");
                break;
            }
        }while(choice != 5);
        
    }
    
    private static void menu(){
        System.out.println("********************************");
        System.out.println("*              MENU            *");
        System.out.println("* 1. Add a (key, value) pair   *");
        System.out.println("* 2. Remove a value by its key *");
        System.out.println("* 3. Search a value by its key *");
        System.out.println("* 4. Print out hash table      *");
        System.out.println("* 5. Quit                      *");
        System.out.println("********************************");
    }
}
