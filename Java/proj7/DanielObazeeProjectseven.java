package danielobazeeprojectseven;

import java.util.*;

/**
 * Program name: DanielObazeeProjectSeven.java
 * Author: Daniel Obazee
 * Date created: September 12, 2025
 * 
 *   This program reinforces single-dimensional array concepts by:
 *   - Initializing an array with 25 random integers between 1 and 100.
 *   - Allowing the user to search, sort, and analyze array data via a menu.
 *   - Implementing linear search and selection sort algorithms.
 *   - Calculating range, average, largest, and smallest values in the array.
 *   - Providing a menu-driven interface with options to re-run or exit.
 */


public class DanielObazeeProjectseven {

    // 1. Initialize array with random numbers between 1 and 100
    public static void initializeArray(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + rand.nextInt(100); // 1 to 100 inclusive
        }
    }

    // 2. Linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // 3. Selection sort
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 4. Print array (5 elements per line)
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
            if ((i + 1) % 5 == 0) System.out.println();
        }
    }

    // 5. Range = largest - smallest
    public static int range(int[] arr) {
        return largest(arr) - smallest(arr);
    }

    // 6. Find largest element
    public static int largest(int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    // 7. Find smallest element
    public static int smallest(int[] arr) {
         int min = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    // 8. Find average value
    public static double average(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return (double) sum / arr.length;
    }

    // Print menu options
    public static void printMenu() {
        System.out.println("==== Project Seven Menu ====");
        System.out.println("1. Initialize array (random 1–100)");
        System.out.println("2. Print array (5 per line)");
        System.out.println("3. Linear search (enter key)");
        System.out.println("4. Selection sort (ascending)");
        System.out.println("5. Range (max - min)");
        System.out.println("6. Largest element");
        System.out.println("7. Smallest element");
        System.out.println("8. Average of elements");
        System.out.println("9. Re-run or Exit");
        System.out.println("============================");
    }

    // Read validated integer input
    public static int readInt(Scanner in) {
        while (!in.hasNextInt()) {
            System.out.print("Please enter a valid integer: ");
            in.next();
        }
        return in.nextInt();
    }

    // Main function with menu
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[25];
        boolean running = true;

        initializeArray(arr);

        while (running) {
            printMenu();
            System.out.print("Enter choice (1–9): ");
            int choice = readInt(in);

            switch (choice) {
                case 1:
                    System.out.println("Initializing array...");
                    initializeArray(arr);
                    break;

                case 2:
                    System.out.println("Array contents:");
                    printArray(arr);
                    break;

                case 3:
                    System.out.print("Enter key to search: ");
                    int key = readInt(in);
                    int index = linearSearch(arr, key);
                    if (index == -1) {
                        System.out.println("Key not found.");
                    } else {
                        System.out.println("Key found at index: " + index);
                    }
                    break;

                case 4:
                    System.out.println("Sorting array...");
                    selectSort(arr);
                    System.out.println("Sorted array:");
                    printArray(arr);
                    break;

                case 5:
                    System.out.println("Range: " + range(arr));
                    break;

                case 6:
                    System.out.println("Largest value: " + largest(arr));
                    break;

                case 7:
                    System.out.println("Smallest value: " + smallest(arr));
                    break;

                case 8:
                    System.out.printf("Average value: %.2f%n", average(arr));
                    break;

                case 9:
                    System.out.print("Enter R to re-run or E to exit: ");
                    String action = in.next().trim().toUpperCase();
                    if (action.equals("R")) {
                        initializeArray(arr);
                        System.out.println("Array reinitialized.");
                    } else if (action.equals("E")) {
                        running = false;
                        System.out.println("Exiting program.");
                    } else {
                        System.out.println("Invalid input. Returning to menu.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1–9.");
            }

            System.out.println();
        }

        in.close();
    }
}
