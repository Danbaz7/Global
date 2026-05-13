
package csci251projecttwo;


/**
 * MySorts. This program compares the following four sort algorithms:
 * Mergesort, Quick sort, Select sort, and Insert sort
 * 
 * @author Daniel Obazee
 * @version Date: 1-12-2026
 */

public class MySorts 
{
    // **************** INSERTION SORT ****************
    
    
//    
//    public static void insertSort(int arr[])
//    {
//        for (int i = 1; i < arr.length; i++) {
//            int key = arr[i];
//            int j = i - 1;
//
//            // Move elements greater than key to the right
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j--;
//            }
//
//            arr[j + 1] = key;
//        }
//    }
    
    
    public static void insertSort(int[] numbers) {
    for (int i = 1; i < numbers.length; i++) {
        int j = i;
        
       // Insert numbers[i] into sorted part
      // stopping once numbers[i] in correct position/ only swap if the conditions are met
      
        while (j > 0 && numbers[j] < numbers[j - 1]) {
            int temp = numbers[j];
            numbers[j] = numbers[j - 1];
            numbers[j - 1] = temp;
            j--;
        }
    }
}



    // **************** SELECTION SORT ****************
    public static void selectSort(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            // Find the smallest element in the unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    // **************** QUICK SORT ****************

    // Partition using Hoare partition scheme
private static int pivot(int[] arr, int lowIndex, int highIndex)
{
    // Pick middle element as pivot
    int midpoint = lowIndex + (highIndex - lowIndex) / 2;
    int pivot = arr[midpoint];

    boolean done = false;

    while (!done) {

        // Move lowIndex right while arr[lowIndex] < pivot
        while (arr[lowIndex] < pivot) {
            lowIndex++;
        }

        // Move highIndex left while pivot < arr[highIndex]
        while (pivot < arr[highIndex]) {
            highIndex--;
        }

        // If pointers cross, partition is complete
        if (lowIndex >= highIndex) {
            done = true;
        } else {
            // Swap arr[lowIndex] and arr[highIndex]
            int temp = arr[lowIndex];
            arr[lowIndex] = arr[highIndex];
            arr[highIndex] = temp;

            // Move both pointers inward
            lowIndex++;
            highIndex--;
        }
    }

    return highIndex;  // index of last element in low partition
}

    
    
    private static void quickSortRecursive(int[] arr, int begin, int end)
    {
        if (begin >= end) return;

        int pivotIndex = pivot(arr, begin, end);

        quickSortRecursive(arr, begin, pivotIndex);
        quickSortRecursive(arr, pivotIndex + 1, end);
    }

    public static void quickSort(int arr[])
    {
        quickSortRecursive(arr, 0, arr.length - 1);
    }


    // **************** MERGE SORT ****************

    private static void merge(int[] arr, int start, int middle, int end)
    {
        int leftSize = middle - start + 1;
        int rightSize = end - middle;

        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // Copy data
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[start + i];
        }
        for (int j = 0; j < rightSize; j++) {
            right[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0, k = start;

        // Merge back into arr
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements
        while (i < leftSize) {
            arr[k++] = left[i++];
        }

        while (j < rightSize) {
            arr[k++] = right[j++];
        }
    }

    private static void mergeSortRecursive(int[] arr, int begin, int end)
    {
        if (begin >= end) return;

        int middle = begin + (end - begin) / 2;

        mergeSortRecursive(arr, begin, middle);
        mergeSortRecursive(arr, middle + 1, end);

        merge(arr, begin, middle, end);
    }

    public static void mergeSort(int arr[])
    {
        mergeSortRecursive(arr, 0, arr.length - 1);
    }
}