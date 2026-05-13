/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci251projectone;

/**
 *
 * @author danielobazee
 */
public class MySearch
{ 
	//***** Linear Search *******************
    public static int linearSearch(int arr[], int target)
    {
        // Code implementation for Linear Search
        for(int i =0; i<arr.length; i++){
		
		// Return the index if the target is found
                if(arr[i] == target)
                    return i;
        }
        
		return -1;	// Return -1 if the target is not found
    }
    
	//***** Binary Search *******************
   public static int binarySearch(int arr[], int target)
    {
        int left = 0;
        int right = arr.length - 1;

        // Continue while the search space is valid
        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if the middle element is the target
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller, search the left half
            if (target < arr[mid]) {
                right = mid - 1;
            }
            // Otherwise search the right half
            else {
                left = mid + 1;
            }
        }

        // Return -1 if the target is not found
        return -1;
    }

}