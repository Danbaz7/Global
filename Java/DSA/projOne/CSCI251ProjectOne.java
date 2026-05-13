/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csci251projectone;

/**
 *
 * @author danielobazee
 */
import java.util.*;

public class CSCI251ProjectOne
{
    public static final int RANGE = 10000;
    
    /**
     * Randomly fill up the given array with integers from 0 to 10000
     */
    public static void fillArray(int [] arr)
    {
        Random randGen = new Random();
        for(int i = 0; i < arr.length; i++)
            arr[i] = randGen.nextInt(RANGE);
    }
    
    /**
     * copy the content in second array to first array. We assume 
     * two array has same size
     * @param firstArray the destination of copy action
     * @param secondArray the source of copy action
     */
    public static void copy(int [] firstArray, int [] secondArray)
    {
        for(int i = 0; i < secondArray.length; i++)
            firstArray[i] = secondArray[i];
    }
	
    /**
     * SortArray
     * @return arr. SortedArray is sorted from least to largest
     */
    public static int[] sortArray(int[] arr)
    {
        // The outer loop ends the iteration before the last index
        for (int i = 0; i < arr.length - 1; i++)
        {
            // Initialize the smallest index to index i
            int indexSmallest = i;
            
            // The inner loop iterates until the last index
            for (int j = i + 1; j < arr.length; j++)
            {
                // Compares indexed variables j and the smallest index
                if (arr[j] < arr[indexSmallest])
                {
                    indexSmallest = j;
                }
            }
            
            // Swap data[i] with data[indexSmallest]
            int temp = arr[i];
            arr[i] = arr[indexSmallest];
            arr[indexSmallest] = temp;
        }
        
        return arr;
    }
    
    /**
     * Run the search algorithm on the given array. The array will not be modified
     * @param arr The array that is used to run the search. The array will not be modified
     * @name The name of search algorithm that is run
     */
    public static void runSearch(int [] arr, int item, String name)
    {
        long totalTime = 0;
        int resultIndex = 0;
		
        int [] a = new int[arr.length];
        int [] b = new int[arr.length];
        copy(a, arr); // copy arr to a
        copy(b, arr); // copy arr to b
		
		// Sort the randomly filled array
		int [] sortedArray = sortArray(b);
        
        // get start time
        long start = System.nanoTime();
		
        if(name.equals("Linear Search"))
            resultIndex = MySearch.linearSearch(a, item);
        else if(name.equals("Binary Search"))
            resultIndex = MySearch.binarySearch(sortedArray, item);
            
        long end = System.nanoTime();
        
        totalTime = end - start;
        System.out.println("Execution time for " + name + " is: " + totalTime + " nanoseconds");
        
        if (resultIndex == -1) {
            System.out.println("Element is not present in array \n");
        } else {
            System.out.println("Element " + item + " is present at index " + resultIndex + "\n");
        }
    }
    
    /**
     * display the test menu
     */
    public static void displayMenu()
    {
        System.out.println("***************************");
        System.out.println("*          MENU           *");
        System.out.println("* 1. Fill Array           *");
        System.out.println("* 2. Linear Search        *");
        System.out.println("* 3. Binary Search        *");
        System.out.println("* 4. Quit                 *");
        System.out.println("***************************");
    }
    
    public static void main(String [] args){
        int choice;
        int item;
        int [] arr = new int[RANGE];
        
        Scanner input = new Scanner(System.in);
        do{
            displayMenu();
            System.out.println("Enter you choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1: // generate a new random filled array
                    fillArray(arr);
                    System.out.print("Array successfully randomly-generated for search operations: \n\n");
                    break;
                case 2: // linear search
					System.out.print("Enter the element item to run Linear Search: ");
					item = input.nextInt();
                    runSearch(arr, item, "Linear Search");
                    break;
                case 3: // binary search
					System.out.print("Enter the element item to run Binary Search: ");
					item = input.nextInt();
                    runSearch(arr, item, "Binary Search");
                    break;
                case 4: // quit
                    System.out.println("Make sure that you have good documentation!");
                    break;
                default: // wrong choice
                    
            }
            
        }while(choice != 4);
    }
   
}